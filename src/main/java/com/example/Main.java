package com.example;

public class Main {
    public static void main(String[] args) {


        System.out.println("----------------------------------------");

        // Atributos

        Estadio estadio1 = new Estadio();
        Estadio estadio2 = new Estadio();

        estadio1.nombre = "Metropolitano";
        estadio1.ciudad = "Barranquilla";
        estadio1.capacidad = 46692;

        estadio2.nombre = "El Campin";
        estadio2.ciudad = "Bogota";
        estadio2.capacidad = 39000;

        // Métodos

        estadio1.mostrarInformacion();
        estadio2.mostrarInformacion();


        System.out.println("----------------------------------------");

        // Ejercicio jugadores de fútbol--- Instaciación:

        JugadorFutbol jugador1 = new JugadorFutbol();
        JugadorFutbol jugador2 = new JugadorFutbol();

        // Atributos

        jugador1.nombreJugador = "David Beckhan";
        jugador1.edad = 35;
        jugador1.posicion = "Delantero";

        jugador2.nombreJugador = "Cristiano Ronaldo";
        jugador2.edad = 40;
        jugador2.posicion = "Delantero centro";

        // Metodos

        jugador1.presentarJugador();
        jugador2.presentarJugador();


        System.out.println("------------------------------------------");

        // Nueva posición

        jugador1.nuevaPosicion = "Medio campista";
        jugador2.nuevaPosicion = "Defensor";

        // Método cambio posición jugador


        jugador1.cambiarPosicion();
        jugador2.cambiarPosicion();

    }
}
