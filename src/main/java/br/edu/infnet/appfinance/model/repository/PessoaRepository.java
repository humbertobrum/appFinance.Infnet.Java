package br.edu.infnet.appfinance.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appfinance.model.domain.Pessoa;

@Repository
public interface PessoaRepository extends CrudRepository<Pessoa, Integer> {

}