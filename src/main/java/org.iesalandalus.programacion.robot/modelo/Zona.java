package org.iesalandalus.programacion.robot.modelo;

import java.nio.charset.CoderResult;
import java.security.MessageDigest;
import java.util.Objects;

public record Zona(int ancho, int alto) {

    public static final int ANCHO_MINIMO = 10;
    public static final int ANCHO_MAXIMO = 100;
    public static final int ALTO_MINIMO = 10;
    public static final int ALTO_MAXIMO = 100;

    public Zona {
        validarAncho(ancho);
        validarAlto(alto);
    }

    public Zona() {
        this(ANCHO_MINIMO, ALTO_MINIMO);
    }

    private void validarAncho(int ancho) {
        if (ancho > ANCHO_MAXIMO) {
            throw new IllegalArgumentException("Ancho no válido.");
        }
        if (ancho < ANCHO_MINIMO) {
            throw new IllegalArgumentException("Ancho no válido.");
        }
    }

    private void validarAlto(int alto) {
        if (alto > ALTO_MAXIMO) {
            throw new IllegalArgumentException("Alto no válido.");
        }
        if (alto < ALTO_MINIMO) {
            throw new IllegalArgumentException("Alto no válido.");
        }
    }

    public Coordenada getCentro() {
        return new Coordenada(ancho /2,alto/2);
    }

    public boolean pertenece(Coordenada coordenada) {
        Objects.requireNonNull(coordenada,"La coordenada no puede ser nula.");
        boolean estado = false;
        if (perteneceX(coordenada.x()) && perteneceY(coordenada.y())){
            estado = true;
        }
        return estado;
    }

    private boolean perteneceX(int x) {
        boolean estado = true;
        if (x >= ancho | x < 0) {
            estado=false;
        }
        return estado;
    }

    private boolean perteneceY(int y) {
        boolean estado = true;

        if (y >= alto | y < 0) {
            estado = false;
        }
        return estado;
    }
}
