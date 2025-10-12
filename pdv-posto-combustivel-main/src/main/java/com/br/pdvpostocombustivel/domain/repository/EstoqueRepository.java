package com.br.pdvpostocombustivel.domain.repository;

import com.br.pdvpostocombustivel.domain.entity.Estoque;
import org.springframework.data.jpa.repository.JpaRepository;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Optional;

public interface EstoqueRepository extends JpaRepository<Estoque, Long>{

    Optional<Estoque> findByLocalEndereco(String localEndereco);
    Optional<Estoque> findByDataValidade(LocalDate dataValidade);
    Optional<Estoque> findByQuantidade(BigDecimal quantidade);
    Optional<Estoque> findByLocalTanque(String localTanque);
    Optional<Estoque> findByLoteFabricacao(String  loteFabricacao);

    boolean existsByLocalEndereco(String localEndereco);
    boolean existsByDataValidade(LocalDate dataValidade);
    boolean existsByQuantidade(BigDecimal quantidade);
    boolean existsByLocalTanque(String localTanque);
    boolean existsByLoteFabricacao(String  loteFabricacao);
}
