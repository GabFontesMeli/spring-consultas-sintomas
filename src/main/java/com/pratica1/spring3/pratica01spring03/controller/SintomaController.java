package com.pratica1.spring3.pratica01spring03.controller;


import com.pratica1.spring3.pratica01spring03.dto.SintomaDTO;
import com.pratica1.spring3.pratica01spring03.entity.Sintoma;
import com.pratica1.spring3.pratica01spring03.service.SintomaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/symptoms")
public class SintomaController {
    @Autowired
    private SintomaService sintomaService;

    @PostMapping("/save")
    public ResponseEntity<Sintoma> saveSymptom(@RequestBody Sintoma sintoma){
        sintomaService.save(sintoma);
        return ResponseEntity.ok(sintoma);
    }

    @GetMapping("/findSymptom")
    public ResponseEntity<List<Sintoma>> getAllSymptom(){
        return ResponseEntity.ok(sintomaService.findAllSymptom());
    }

    @GetMapping("/findSymptom/{name}")
    public ResponseEntity<SintomaDTO> getSymptomByName(@PathVariable String name){
        Optional<Sintoma> sintoma = sintomaService.findByName(name);
        if(sintoma.isPresent()) {
            return new ResponseEntity(SintomaDTO.convertToDto(sintoma.get()), HttpStatus.ACCEPTED);
        }else{
            return new ResponseEntity("Este sintoma Não foi encontrado.", HttpStatus.BAD_REQUEST);
        }
    }

}

