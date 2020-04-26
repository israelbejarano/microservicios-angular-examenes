package com.curso.microservicios.app.examenes.services;


import org.springframework.stereotype.Service;

import com.curso.microservicios.app.examenes.models.entity.Examen;
import com.curso.microservicios.app.examenes.models.repository.ExamenRepository;
import com.curso.microservicios.commons.services.CommonServiceImpl;

@Service
public class ExamenServiceImpl extends CommonServiceImpl<Examen, ExamenRepository> implements ExamenService{


}
