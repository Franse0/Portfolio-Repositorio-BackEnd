
package com.porfolio.api.repository;

import com.porfolio.api.model.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface ExperienciaRepository extends JpaRepository<Experiencia, Long>{
    
}
