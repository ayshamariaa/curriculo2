package com.api_rest.curriculos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api_rest.curriculos.model.Curriculo;

public interface CurriculoRepository extends JpaRepository<Curriculo, Long> {
    
}