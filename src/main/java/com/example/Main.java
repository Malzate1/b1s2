package com.example;

public class Main {
    public static void main(String[] args) {

        // Atributos



        Estadio estadio1= new Estadio();
        Estadio estadio2= new Estadio();

        estadio1.nombre="Metropolitano";
        estadio1.ciudad="Barranquilla";
        estadio1.capacidad=46692;

        estadio2.nombre="El Campin";
        estadio2.ciudad="Bogota";
        estadio2.capacidad=39000;


        // Métodos 

        estadio1.mostrarInformacion();
        estadio2.mostrarInformacion();








       
    }
}

