package com.newton.aaw.provaArquitetura.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.newton.aaw.provaArquitetura.api.ProcessoDto;
import com.newton.aaw.provaArquitetura.domain.entity.Processo;
import com.newton.aaw.provaArquitetura.service.ProcessoService;

@RestController
public class ProcessoController {

	private final ProcessoService ProcessoService;
	private com.newton.aaw.provaArquitetura.service.ProcessoService processoService;
	
	public ProcessoController(ProcessoService processoService) {
		this.ProcessoService = new ProcessoService();
		this.processoService = processoService;
	}
	
	@GetMapping("/users/{id}")
	public ProcessoDto getById(@PathVariable String id) {
		
		
		ProcessoDto processo = null;
		return new ProcessoDto(processo);
	}
	
	@GetMapping("/users")
	public List<ProcessoDto> getAll() {
		var processos = processoService.getAll();
		
		var processoDtos = new ArrayList<ProcessoDto>();
		
		for (Processo processo: processos) {
			processoDtos.add(new ProcessoDto(processo));
		}
		
		return processoDtos;
	}
	
	@PostMapping("/users")
	public ProcessoDto create(@RequestBody ProcessoDto u) {
		var processo = new Processo(u);
		
		processo = processoService.create(processo);
		
		return new ProcessoDto(processo);
	}
	
	@PutMapping("/users/{id}")
	public ProcessoDto update(@PathVariable String id, @RequestBody ProcessoDto u) {
		var processo = new Processo(u);

		processo = processoService.update(id, processo);
		
		return new ProcessoDto(processo);
	}
	
	@DeleteMapping("/users/{id}")
	public ResponseEntity<Void> delete(@PathVariable String id) {
		processoService.delete(id);
		
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
}
