package com.br.zup.apizup.model.repositories;


import org.springframework.data.repository.PagingAndSortingRepository;


import com.br.zup.apizup.model.entities.Endereco;

public interface EnderecoRepository extends
PagingAndSortingRepository<Endereco, Integer>{

}
