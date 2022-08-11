package com.example.Controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.Entities.Base;
import com.example.Services.BaseServiceImpl;

public abstract class BaseControllerImpl<E extends Base, S extends BaseServiceImpl<E, Long>> implements BaseController<E,Long> {
	
	@Autowired
	protected S servicio;
	
	
	@GetMapping("")
	public ResponseEntity<?> getAll(){ /* ResponseEntity nos brinda nuestra respuesta o status en formato JSON  */
		
		try {
			return ResponseEntity.status(HttpStatus.OK).body(servicio.getAll());
			
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"" + e.getMessage() + "\"}");
		}
	}
	
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getOne(@PathVariable Long id){ 
		try {
			return ResponseEntity.status(HttpStatus.OK).body(servicio.getOne(id));
			
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"" + e.getMessage() + "\"}");
		}
	}
	
	@PostMapping("")
	public ResponseEntity<?> save(@RequestBody E entity){ 
		try {
			return ResponseEntity.status(HttpStatus.OK).body(servicio.save(entity));
			
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"" + e.getMessage() + "\"}");
		}
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> update(@RequestBody E entity, @PathVariable Long id){ 
		try {
			return ResponseEntity.status(HttpStatus.OK).body(servicio.update(id, entity));
			
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"" + e.getMessage() + "\"}");
		}
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete(@PathVariable Long id){ 
		try {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).body(servicio.delete(id));
			
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"" + e.getMessage() + "\"}");
		}
	}
}
