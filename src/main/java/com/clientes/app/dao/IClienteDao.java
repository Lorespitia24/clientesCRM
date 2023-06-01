package com.clientes.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.clientes.app.model.entity.Cliente;

public interface IClienteDao extends JpaRepository<Cliente, Long>{


	
} 
