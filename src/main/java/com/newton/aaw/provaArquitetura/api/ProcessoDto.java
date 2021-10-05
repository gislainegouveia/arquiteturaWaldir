package com.newton.aaw.provaArquitetura.api;

import java.time.LocalDateTime;


import org.springframework.data.annotation.Id;

import com.newton.aaw.provaArquitetura.domain.entity.Processo;

//import org.springframework.data.annotation.Id;

public class ProcessoDto {
	
	
	@Id
	private String id;
	
	private String descricao;
	
	private String autor; 
	
	private String local;
	
	private LocalDateTime dataDePublicacao;
	
	//private int status;
	private LocalDateTime createdAt;
	
	private LocalDateTime modifiedAt;
	
	
	
	public ProcessoDto(ProcessoDto processoDto) {
		this.id = processoDto.getId();
		this.descricao = processoDto.getDescricao();
		this.autor = processoDto.getAutor();
		this.local = processoDto.getLocal();
		this.dataDePublicacao = processoDto.getdataDePublicacao();
	}
	



	public ProcessoDto(Processo processo) {
		// TODO Auto-generated constructor stub
	}




	public LocalDateTime getdataDePublicacao() {
		// TODO Auto-generated method stub
		return null;
	}



	public String getLocal() {
		// TODO Auto-generated method stub
		return null;
	}



	public String getAutor() {
		// TODO Auto-generated method stub
		return null;
	}



	public String getDescricao() {
		// TODO Auto-generated method stub
		return null;
	}



	public String getId() {
		// TODO Auto-generated method stub
		return null;
	}




	public LocalDateTime getdataDePublicacao1() {
		// TODO Auto-generated method stub
		return null;
	}




	public void setDescricao(Object descricao2) {
		// TODO Auto-generated method stub
		
	}
}

