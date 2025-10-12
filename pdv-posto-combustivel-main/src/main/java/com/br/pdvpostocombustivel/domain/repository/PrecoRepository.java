package com.br.pdvpostocombustivel.domain.repository;

import com.br.pdvpostocombustivel.domain.entity.Preco;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.xml.crypto.Data;
import java.math.BigDecimal;
import java.util.Optional;


public interface PrecoRepository extends JpaRepository<Preco, Long> {
    Optional<Preco> findByValor(BigDecimal Valor);
    Optional<Preco> findByDataAlteracao(Data dataAlteracao);
    Optional<Preco> findByHoraAlteracao(Data horaAlteracao);
    boolean existsByValor(BigDecimal Valor);
    boolean existsByDataAlteracao(Data dataAlteracao);
    boolean existsByHoraAlteracao(Data horaAlteracao);



}
