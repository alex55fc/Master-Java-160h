package com.relaciones.principal;

import jakarta.persistence.Persistence;

public class Generar {
    public static void main(String[] args) {
        Persistence.generateSchema("bibliotec3", null);

    }
}
