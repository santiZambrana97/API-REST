package com.example.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Entities.Jugador;
import com.example.Repositories.BaseRepository;
import com.example.Repositories.JugadorRepository;

@Service
public class JugadorServiceImpl extends BaseServiceImpl<Jugador, Long> implements JugadorService {
	
	@Autowired  /* esto para crear la inyecion de dependencia y poder acceder a los metodos o querys del repositorio especifico */
	private JugadorRepository jugadorRepository;
	
	public JugadorServiceImpl(BaseRepository<Jugador,Long> baseRepository ) {
		super(baseRepository);
	}

	

}
