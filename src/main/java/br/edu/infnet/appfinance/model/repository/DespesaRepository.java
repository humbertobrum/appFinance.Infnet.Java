package br.edu.infnet.appfinance.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appfinance.model.domain.Despesa;

@Repository
public interface DespesaRepository extends CrudRepository<Despesa, Integer> {

}