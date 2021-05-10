package com.br.zup.apizup.model.repositories;


import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.br.zup.apizup.model.entities.Endereco;

@Repository
public interface EnderecoRepository extends
JpaRepository<Endereco, Long>{

	List<Endereco>listarEnderecoPorUsuario(Long id);
	
	/*@Query("SELECT e FROM tb_endereco e where e.usuario_id = :	param_id")
	Optional<Endereco> listarEnderecosPorUsuario(@Param("param_id") Long id); */
}
