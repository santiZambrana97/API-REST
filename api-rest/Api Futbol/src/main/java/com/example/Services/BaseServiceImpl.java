package com.example.Services;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import com.example.Entities.Base;
import com.example.Entities.Jugador;
import com.example.Repositories.BaseRepository;

public abstract class BaseServiceImpl <E extends Base, ID extends Serializable> implements BaseService<E, ID> {
	
	protected BaseRepository<E,ID> baseRepository;
	
	public BaseServiceImpl (BaseRepository baseRepository) {
		this.baseRepository= baseRepository;
	}
	
	@Override
	@Transactional
	public List<E> getAll() throws Exception {
		try {
		 List<E> entities = baseRepository.findAll();
		 return entities;
			
		} catch (Exception e) {
			throw new Exception (e.getMessage());
		}
	}

	@Override
	@Transactional
	public E getOne(ID id) throws Exception {
		try {
		  Optional<E> entityOptional = baseRepository.findById(id);
		  return entityOptional.get();
			
		} catch (Exception e) {
			throw new Exception (e.getMessage());
		}
	}

	@Override
	@Transactional
	public E save(E entity) throws Exception {
		try {
			entity = baseRepository.save(entity);
			return entity;
			
		} catch (Exception e) {
			throw new Exception (e.getMessage());
		}
	}

	@Override
	@Transactional
	public E update(ID id, E entity) throws Exception {
		try {
			Optional<E> entityOptional = baseRepository.findById(id);
			E entityUpdate = entityOptional.get();
			entityUpdate = baseRepository.save(entityUpdate);
			return entityUpdate;
		} catch (Exception e) {
			throw new Exception (e.getMessage());
		}
	}

	@Override
	@Transactional
	public boolean delete(ID id) throws Exception {
		try {
			
			if(baseRepository.existsById(id)){
				baseRepository.deleteById(id);
				return true;
			} else {
				throw new Exception();
			}
			
		} catch (Exception e) {
			throw new Exception (e.getMessage());
		}
	}
}
