package com.horizondevs.radiohorizon.principal;

import com.horizondevs.radiohorizon.modelos.Cancion;
import com.horizondevs.radiohorizon.modelos.MisFavoritos;
import com.horizondevs.radiohorizon.modelos.Podcast;

public class Principal {

    public static void main(String[] args){

        Cancion miCancion = new Cancion();
        miCancion.setTitulo("El Triste");
        miCancion.setAlbum("Guardian del Amor");

        Podcast miPodcast = new Podcast();
        miPodcast.setTitulo("Conversando de IT");
        miPodcast.setPresentador("Cupertino Bite");


        // Canciones
        for (int i = 0; i < 120; i++) {
            miCancion.meGusta();
        }

        for (int i = 0; i < 14867; i++) {
            miCancion.reproduce();
        }

        // Podcast
        for (int i = 0; i < 245; i++) {
            miPodcast.meGusta();
        }

        for (int i = 0; i < 12453; i++) {
            miPodcast.reproduce();
        }

        System.out.println("Veces reproducida: " + miCancion.getTotalDeReproducciones());
        System.out.println("No. de me gusta:" + miCancion.getTotalDeMeGusta());

        MisFavoritos favoritos = new MisFavoritos();
        favoritos.adiciones(miPodcast);
        favoritos.adiciones(miCancion);


    }

}
