package com.newton.aaw.provaArquitetura.domain.entity;

import java.time.LocalDateTime;

import com.newton.aaw.provaArquitetura.api.ProcessoDto;

/*import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;

import com.newton.aaw.hr.api.EmployeeDto;
import com.newton.aaw.hr.domain.entity.enums.Gender;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor*/
public class Processo {

	//@Id
	private String id;
	private String descricao;
	private String autor;
	private String local;
	private LocalDateTime dataDePublicacao;

	private LocalDateTime createdAt;
	
	private LocalDateTime modifiedAt;
	
	
	
	
	public Processo(ProcessoDto e) {
		this.id = e.getId();
		this.descricao = e.getDescricao();
		this.autor = e.getAutor();
		this.local = e.getLocal();
		this.dataDePublicacao = e.getdataDePublicacao1();
		
		
	}


	public void setCreatedAt(LocalDateTime now) {
		// TODO Auto-generated method stub
		
	}


	public void setModifiedAt(LocalDateTime now) {
		// TODO Auto-generated method stub
		
	}


	public Object getDescricao() {
		// TODO Auto-generated method stub
		return null;
	}


	public void setDescricao(Object descricao2) {
		// TODO Auto-generated method stub
		
	}


	public Object getAutor() {
		// TODO Auto-generated method stub
		return null;
	}


	public Object getLocal() {
		// TODO Auto-generated method stub
		return null;
	}


	public void setLocal(Object local2) {
		// TODO Auto-generated method stub
		
	}


	public Object getDataDePublicacao() {
		// TODO Auto-generated method stub
		return null;
	}


	public Object getDescricao1() {
		// TODO Auto-generated method stub
		return null;
	}




	public void setAutor(Object autor2) {
		// TODO Auto-generated method stub
		
	}


	public void setDataDePublicacao(Object dataDePublicacao2) {
		// TODO Auto-generated method stub
		
	}
}