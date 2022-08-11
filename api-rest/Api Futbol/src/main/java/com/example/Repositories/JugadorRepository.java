package com.example.Repositories;


import org.springframework.stereotype.Repository;

import com.example.Entities.Jugador;

/*Permite separar la logica de negocio de la logica para acceder a la base de datos, este se va a comunicar directamente con la bd*/

@Repository
public interface JugadorRepository extends BaseRepository<Jugador, Long> {
}
