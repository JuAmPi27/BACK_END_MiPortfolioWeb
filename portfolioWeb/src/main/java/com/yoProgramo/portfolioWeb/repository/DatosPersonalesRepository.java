
package com.yoProgramo.portfolioWeb.repository;

import com.yoProgramo.portfolioWeb.model.DatosPersonales;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DatosPersonalesRepository extends JpaRepository<DatosPersonales, Long> {
    
}
