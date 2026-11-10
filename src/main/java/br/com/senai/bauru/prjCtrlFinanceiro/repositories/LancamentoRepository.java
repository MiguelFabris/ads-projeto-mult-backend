package br.com.senai.bauru.prjCtrlFinanceiro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.senai.bauru.prjCtrlFinanceiro.models.Lancamento;

@Repository
public interface LancamentoRepository extends JpaRepository<Lancamento,Long> {}
