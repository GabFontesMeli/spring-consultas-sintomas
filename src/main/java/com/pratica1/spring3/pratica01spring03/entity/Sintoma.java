package com.pratica1.spring3.pratica01spring03.entity;

import lombok.Data;

@Data
public class Sintoma {
    private Long codigo;
    private String nome;
    private Gravidade gravidade;

}