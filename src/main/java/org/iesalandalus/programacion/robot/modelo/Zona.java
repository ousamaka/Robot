package org.iesalandalus.programacion.robot.modelo;

public record Zona(int ancho, int alto) {

    public static final int ANCHO_MINIMO = 10;
    public static final int ANCHO_MAXIMO = 100;

    public static final int ALTO_MINIMO = 10;
    public static final int ALTO_MAXIMO = 100;


    //canonico
    public Zona {
        validarAncho(ancho);
        validarAlto(alto);
    }

    //por defecto
    public Zona() {
        this(ANCHO_MINIMO, ALTO_MINIMO);
    }


    //con atributos
//    public Zona(int ancho, int alto) {
//        this.ancho = ancho;
//        this.alto = alto;
//    }


    private void validarAncho(int ancho) {
        if (ancho < ANCHO_MINIMO) {
            throw new IllegalArgumentException("El valor del Ancho es menor que el mínimo permitido.");
        } else if (ancho > ANCHO_MAXIMO) {
            throw new IllegalArgumentException("El valor del Ancho es mayor que el mínimo permitido.");
        }
    }

    private void validarAlto(int alto) {
        if (alto < ALTO_MINIMO) {
            throw new IllegalArgumentException("El valor del Alto es menor que el mínimo permitido.");
        } else if (alto > ALTO_MAXIMO) {
            throw new IllegalArgumentException("El valor del Alto es mayor que el mínimo permitido.");
        }
    }

//    public Coordenada getCentro() {
//        int centroX = ancho() / 2;
//        int centroY = alto() / 2;
//        return new Coordenada(centroX, centroY);
//    }

//    public void boolean  pertenece(Coordenada coordenada) {
//
//    }
//    private void perteneceX(int x) {
//        boolean ;
//    }
//
//    private void perteneceY(int y) {
//        boolean ;
//    }
//
}
