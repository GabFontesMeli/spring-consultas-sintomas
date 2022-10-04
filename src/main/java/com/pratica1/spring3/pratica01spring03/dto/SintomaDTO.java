package com.pratica1.spring3.pratica01spring03.dto;

import com.pratica1.spring3.pratica01spring03.entity.Gravidade;
import com.pratica1.spring3.pratica01spring03.entity.Sintoma;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SintomaDTO {
    private String nome;
    private Gravidade gravidade;

    public static SintomaDTO convertToDto(Sintoma sintoma){
        return new SintomaDTO(sintoma.getNome(), sintoma.getGravidade());
    }

}
