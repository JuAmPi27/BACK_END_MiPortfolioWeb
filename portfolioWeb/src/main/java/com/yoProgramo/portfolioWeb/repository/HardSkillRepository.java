
package com.yoProgramo.portfolioWeb.repository;

import com.yoProgramo.portfolioWeb.model.HardSkill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface HardSkillRepository extends JpaRepository<HardSkill, Long> {
    
}
