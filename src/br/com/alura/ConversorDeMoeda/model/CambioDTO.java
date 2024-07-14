package br.com.alura.ConversorDeMoeda.model;

public record CambioDTO(String base_code, String target_code, Double conversion_result) {
}
