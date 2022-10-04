package com.pratica1.spring3.pratica01spring03.repository;

import com.pratica1.spring3.pratica01spring03.entity.Sintoma;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Data
@AllArgsConstructor
public class SintomaRepository {

    private List<Sintoma> sintomaList;

    public void saveSintoma(Sintoma sintoma){
        this.sintomaList.add(sintoma);
    }

}
