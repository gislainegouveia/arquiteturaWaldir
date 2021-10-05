package com.newton.aaw.provaArquitetura.service;

import java.time.LocalDateTime;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.newton.aaw.provaArquitetura.domain.entity.Processo;
import com.newton.aaw.provaArquitetura.domain.repository.ProcessoRepository;

@Service
public class ProcessoService {

	public void processoService(ProcessoRepository processoRepository) {
	}

	// C - CRUD
	public Processo create(Processo u) {

		CrudRepository<Processo, String> processoRepository = null;
		processoRepository.save(u);
		
		return u;
	}
	
	// u - CRUD
	public Processo update(String id, Processo u) {

		// recuperar para validar se existe
		var existing = get(id);

		// update
		existing.setDescricao(u.getDescricao());
		existing.setAutor(u.getAutor());
		existing.setLocal(u.getLocal());
		existing.setDataDePublicacao(u.getDataDePublicacao());
		
		
		
		existing.setModifiedAt(LocalDateTime.now());
		
		CrudRepository<Processo, String> processoRepository;
		//processoRepository.save(existing);
		return existing;
	}
	
	// R - CRUD
	public Processo get(String id) {
		
		CrudRepository<Processo, String> processoRepository;
		//var processo = processoRepository.findById(id);
		return null;
		
		
		
		//return processo.get();
	}
	
	// R - CRUD
	public List<Processo> getAll() {
		MongoRepository<Processo, String> processoRepository = null;
		return processoRepository.findAll();
	}
	
	// D - CRUD
	public void delete(String id) {

		// recuperar para validar se existe
		get(id);
		
		CrudRepository<Processo, String> processoRepository = null;
		processoRepository.deleteById(id);
	}
	
}
