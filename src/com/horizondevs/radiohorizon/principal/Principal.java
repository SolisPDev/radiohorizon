package com.horizondevs.radiohorizon.principal;

import com.horizondevs.radiohorizon.modelos.Cancion;
import com.horizondevs.radiohorizon.modelos.Podcast;

public class Principal {

    public static void main(String[] args){

        Cancion miCancion = new Cancion();
        miCancion.setTitulo("El Triste");
        miCancion.setAlbum("Guardian del Amor");

        Podcast miPodcast = new Podcast();
        miPodcast.setTitulo("Conversando de IT");
        miPodcast.setPresentador("Cupertino Bite");

        for (int i = 0; i < 120; i++) {
            miCancion.meGusta();
        }

        for (int i = 0; i < 4867; i++) {
            miCancion.reproduce();
        }

        System.out.println("Veces reproducida: " + miCancion.getTotalDeReproducciones());
        System.out.println("No. de me gusta:" + miCancion.getTotalDeMeGusta());
    }
}
