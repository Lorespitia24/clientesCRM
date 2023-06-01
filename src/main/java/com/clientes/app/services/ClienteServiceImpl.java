package com.clientes.app.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.clientes.app.dao.IClienteDao;
import com.clientes.app.dao.ITareaDao;
import com.clientes.app.model.entity.Cliente;
import com.clientes.app.model.entity.Origen;
import com.clientes.app.model.entity.Tarea;
import com.clientes.app.model.entity.TipoContacto;


@Service
public class ClienteServiceImpl implements IClienteService {

	@Autowired
	private IClienteDao clienteDao;
	@Autowired
	private ITareaDao tareaDao;

	@Override
	@Transactional(readOnly = true)
	public List<Cliente> findAll() {
		return (List<Cliente>) clienteDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Cliente findById(Long id) {
		return clienteDao.findById(id).orElse(null);
	}
	
	@Override
	@Transactional
	public Cliente save(Cliente cliente) {
		return clienteDao.save(cliente);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		clienteDao.deleteById(id);
	}
	
	public List<TipoContacto> getLisTipoContacto(){
		List<TipoContacto> listaTipoContacto = new ArrayList<>();
		for(TipoContacto tipoContacton : TipoContacto.values()){
			listaTipoContacto.add(tipoContacton);
		}
		return listaTipoContacto;
	}
	
	public List<Origen> getLisOrigen(){
		List<Origen> listaOrigen = new ArrayList<>();
		for(Origen origen : Origen.values()){
			listaOrigen.add(origen);
		}
		return listaOrigen;
	}

	
	//CRUD TAREA
	@Override
	@Transactional(readOnly = true)
	public List<Tarea> findAllTarea() {
		return (List<Tarea>) tareaDao.findAll();
	}
	
	@Override
	@Transactional
	public Tarea saveTarea(Tarea tarea) {
			return tareaDao.save(tarea);

	}
}
