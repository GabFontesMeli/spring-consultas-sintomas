package com.pratica1.spring3.pratica01spring03.entity;

import lombok.Data;

@Data
public class Pessoa {
    private Long id;
    private String nome;
    private String sobrenome;
    private int idade;

}
