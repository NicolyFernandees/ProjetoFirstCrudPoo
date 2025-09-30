package com.unicesumar.FirstCrud.repository;

import com.unicesumar.FirstCrud.model.PessoaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<PessoaModel, Long>{

}
