package com.pratica1.spring3.pratica01spring03.dto;

import com.pratica1.spring3.pratica01spring03.entity.Pessoa;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PessoaDTO {
    private String nome;
    private String sobrenome;

    public static PessoaDTO convertToDto(Pessoa pessoa){
        return new PessoaDTO(pessoa.getNome(), pessoa.getSobrenome());
    }

    public static List<PessoaDTO> convertListToDto(List<Pessoa> pessoaList){
        return pessoaList.stream()
                .map(p -> new PessoaDTO(p.getNome(),p.getSobrenome()))
                .collect(Collectors.toList());
    }

}
