package com.patterns.sample.observer;

import java.util.Observable;

/**
 * Created by s.ahmedouali on 14/04/2015.
 */
public class GPS extends Observable {
    private String position;
    private int precision;

    public GPS(String position, int precision) {
        this.position = position;
        this.precision = precision;
    }

    public GPS() {
    }

    // Méthode permettant de notifier tous les observateurs lors d'un changement d'état du GPS.
    public void notifierObservateurs() {
        setChanged();// Méthode de l'API.
        notifyObservers();// Egalement une méthode de l'API.
    }

    // Méthode qui permet de mettre à jour de façon artificielle le GPS.
    // Dans un cas réel, on utiliserait les valeurs retournées par les capteurs.
    public void setMesures(String position, int precision) {
        this.position = position;
        this.precision = precision;
        notifierObservateurs();
    }

    // Méthode "tiré" donc c'est aux observeurs d'aller chercher les valeurs désiré grâce à un objet Gps.
    // Pour cela on trouve un accesseur en lecture pour position.
    public String getPosition() {
        return position;
    }

    // Un accesseur en lecture pour précision.
    public int getPrecision() {
        return precision;
    }

    @Override
    public String toString() {
        return "Gps{" +
                "position='" + position + '\'' +
                ", precision=" + precision +
                '}';
    }
}
