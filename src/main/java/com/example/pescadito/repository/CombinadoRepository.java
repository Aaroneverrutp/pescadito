package com.example.pescadito.repository;

import com.example.pescadito.model.Combinado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CombinadoRepository extends JpaRepository<Combinado, Integer>{

}
