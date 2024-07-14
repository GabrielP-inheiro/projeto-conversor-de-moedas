package br.com.alura.ConversorDeMoeda.service;

import br.com.alura.ConversorDeMoeda.model.CambioDTO;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ExchangeRate {
    Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.IDENTITY).create();

    public CambioDTO desserializar(String json) {
        CambioDTO cambio = gson.fromJson(json, CambioDTO.class);
        return cambio;
    }
}
