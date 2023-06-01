package com.clientes.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clientes.app.model.entity.Tarea;

public interface ITareaDao extends JpaRepository<Tarea, Long> {

}
