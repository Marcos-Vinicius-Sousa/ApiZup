package com.br.zup.apizup.model.repositories;


import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.br.zup.apizup.model.entities.Endereco;

@Repository
public interface EnderecoRepository extends
JpaRepository<Endereco, Long>{

	List<Endereco>listarEnderecoPorUsuario(Long id);
	
	
}
