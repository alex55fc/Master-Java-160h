package com.grado.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grado.model.Grado;

public interface GradosDao extends JpaRepository<Grado, Integer> {

}
