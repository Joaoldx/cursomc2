package com.joaodomingos.cursomc.Repository;

import com.joaodomingos.cursomc.Domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
}
