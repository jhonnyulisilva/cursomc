package com.udemy.cursomc.repositories;

import com.udemy.cursomc.domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}
