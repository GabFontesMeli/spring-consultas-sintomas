package com.pratica1.spring3.pratica01spring03.service;

import com.pratica1.spring3.pratica01spring03.entity.Pessoa;
import com.pratica1.spring3.pratica01spring03.repository.PesssoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PessoaService {
    @Autowired
    private PesssoaRepository pesssoaRepository;

    public void savePessoa(Pessoa pessoa){
        pesssoaRepository.savePessoa(pessoa);
    }

    public List<Pessoa> getPessoasEmRisco(){
        return pesssoaRepository.getPessoaList().stream()
                .filter(p -> p.getIdade()>60)
                .collect(Collectors.toList());
    }




}
