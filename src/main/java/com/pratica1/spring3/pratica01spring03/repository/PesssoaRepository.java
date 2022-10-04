package com.pratica1.spring3.pratica01spring03.repository;

import com.pratica1.spring3.pratica01spring03.entity.Pessoa;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Data
@AllArgsConstructor
public class PesssoaRepository {

    private List<Pessoa> pessoaList;

    public void savePessoa(Pessoa pessoa){
        this.pessoaList.add(pessoa);
    }

}
