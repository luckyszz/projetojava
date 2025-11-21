package com.leonardo.mc.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leonardo.mc.domain.Categoria;
import com.leonardo.mc.services.CategoriaService;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {

		@Autowired
		private CategoriaService service;	
	
		@RequestMapping("/{id}")
		public ResponseEntity<?> find(@PathVariable Integer id){
			Categoria obj = service.find(id);
			return ResponseEntity.ok().body(obj);
		}

}
	