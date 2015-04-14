package com.patterns.sample.observer;

/**
 * Created by s.ahmedouali on 14/04/2015.
 */
public class Main {

    public static void main(String[] args) {
        // observable.
        GPS observable = new GPS();
        // observeur
        GPSObserver observeur = new GPSObserver();
        observable.addObserver(observeur);
        // On simule l'arrivée de nouvelles valeurs via des capteurs.
        System.out.println(">> On simule l'arrivée de nouvelles valeurs via des capteurs.");
        observable.setMesures("N 39°59°993 / W 123°00°000", 4);
        // Nouvelle simulation
        System.out.println(">> nouvelle simulation");
        observable.setMesures("N 37°48°898 / W 124°12°011", 5);
    }


}
