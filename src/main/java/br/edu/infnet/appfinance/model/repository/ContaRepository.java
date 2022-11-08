package br.edu.infnet.appfinance.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appfinance.model.domain.ContaBancaria;

@Repository
public interface ContaRepository extends CrudRepository<ContaBancaria, Integer> {

}