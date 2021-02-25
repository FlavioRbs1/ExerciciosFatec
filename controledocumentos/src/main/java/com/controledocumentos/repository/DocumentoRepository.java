package com.controledocumentos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.controledocumentos.models.Documento;

public interface DocumentoRepository extends JpaRepository<Documento, Integer> {

}
