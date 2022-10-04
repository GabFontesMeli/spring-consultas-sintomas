package com.pratica1.spring3.pratica01spring03.controller;

import com.pratica1.spring3.pratica01spring03.dto.PessoaDTO;
import com.pratica1.spring3.pratica01spring03.entity.Pessoa;
import com.pratica1.spring3.pratica01spring03.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PessoaController {
    @Autowired
    private PessoaService pessoaService;

    @GetMapping("/findRiskPerson")
    public ResponseEntity<List<PessoaDTO>> getPessoasEmRisco(){
        return ResponseEntity.ok(PessoaDTO.convertListToDto(pessoaService.getPessoasEmRisco()));
    }

    @PostMapping("save")
    public ResponseEntity<Pessoa> savePessoa(@RequestBody Pessoa pessoa){
        pessoaService.savePessoa(pessoa);
        return ResponseEntity.ok(pessoa);
    }

}