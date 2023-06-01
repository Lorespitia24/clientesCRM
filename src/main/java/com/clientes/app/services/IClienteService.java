package com.clientes.app.services;

import java.util.List;

import com.clientes.app.model.entity.Cliente;
import com.clientes.app.model.entity.Origen;
import com.clientes.app.model.entity.Tarea;
import com.clientes.app.model.entity.TipoContacto;


public interface IClienteService {

	public List<Cliente> findAll();
	
	public Cliente findById(Long id);
	
	public Cliente save(Cliente cliente);
	
	public void delete(Long id);
	
	public List<TipoContacto> getLisTipoContacto();
	
	public List<Origen> getLisOrigen();
	
	public Tarea saveTarea(Tarea tarea);
	
	public List<Tarea> findAllTarea();
	
}
