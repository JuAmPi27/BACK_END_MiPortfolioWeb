
package com.yoProgramo.portfolioWeb.repository;

import com.yoProgramo.portfolioWeb.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CursoRepository extends JpaRepository<Curso, Long> {
    
}
