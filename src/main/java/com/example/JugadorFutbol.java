package com.example;

public class JugadorFutbol {

    //Atributos

    String nombreJugador;
    int edad;
    String posicion;
    String nuevaPosicion;

    //Método

    void presentarJugador(){

        System.out.println(" El jugador " +nombreJugador + " tiene " + edad + " años  y juega como " +posicion + ".");


    }

    void cambiarPosicion(){

        System.out.println(" El jugador " +nombreJugador + " ahora juega como " +nuevaPosicion + ".");
    }


}
