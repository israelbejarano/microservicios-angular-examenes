package com.curso.microservicios.app.examenes.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.curso.microservicios.app.examenes.models.entity.Examen;
import com.curso.microservicios.app.examenes.services.ExamenService;
import com.curso.microservicios.commons.controllers.CommonController;

@RestController
public class ExamenController extends CommonController<Examen, ExamenService> {
	
	@PutMapping("/{id}")
	public ResponseEntity<?> editar(@RequestBody Examen examen, @PathVariable Long id) {
		
		return null;
	}

}
