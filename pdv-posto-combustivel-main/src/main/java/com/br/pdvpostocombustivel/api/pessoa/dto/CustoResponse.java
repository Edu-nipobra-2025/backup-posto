package com.br.pdvpostocombustivel.api.pessoa.dto;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public record CustoResponse(
        Double imposto,
        Double custoVariavel,
        Double custoFixo,
        Double margemLucro,
        @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
        LocalDate dataProcessamento)
{ }