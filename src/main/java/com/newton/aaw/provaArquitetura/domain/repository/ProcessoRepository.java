package com.newton.aaw.provaArquitetura.domain.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.newton.aaw.provaArquitetura.domain.entity.Processo;


public interface ProcessoRepository extends MongoRepository <Processo, String>{

}
