
package com.yoProgramo.portfolioWeb.repository;

import com.yoProgramo.portfolioWeb.model.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducacionRepository extends JpaRepository<Educacion, Long> {
    
}
