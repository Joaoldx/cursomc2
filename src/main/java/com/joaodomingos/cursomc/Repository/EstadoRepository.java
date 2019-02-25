package com.joaodomingos.cursomc.Repository;

import com.joaodomingos.cursomc.Domain.Estado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer> {
}
