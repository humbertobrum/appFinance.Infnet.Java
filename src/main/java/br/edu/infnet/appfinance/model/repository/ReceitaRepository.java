package br.edu.infnet.appfinance.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appfinance.model.domain.Receita;

@Repository
public interface ReceitaRepository extends CrudRepository<Receita, Integer> {

}