package com.joaodomingos.cursomc.Repository;

import com.joaodomingos.cursomc.Domain.Cliente;
import com.joaodomingos.cursomc.Domain.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {
}
