package com.relaciones.creartablas;

import jakarta.persistence.Persistence;

public class Generar {
    public static void main(String[] args) {
        Persistence.generateSchema("periodicojercicio", null);

    }
}
