package com.example.Controllers;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entities.Jugador;
import com.example.Services.JugadorServiceImpl;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/jugadores")
public class JugadorController extends BaseControllerImpl<Jugador, JugadorServiceImpl> {
	
	
	
}
