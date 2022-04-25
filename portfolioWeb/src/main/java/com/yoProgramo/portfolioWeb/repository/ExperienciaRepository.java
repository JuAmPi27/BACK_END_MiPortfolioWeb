
package com.yoProgramo.portfolioWeb.repository;

import com.yoProgramo.portfolioWeb.model.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienciaRepository extends JpaRepository<Experiencia, Long> {
    
}
