package com.patterns.sample.observer;

import java.util.Observable;

/**
 * Created by s.ahmedouali on 14/04/2015.
 */
public class GPS extends Observable {
    private String position;
    private int precision;

    public GPS() {
        super();
    }

    /**
     * Méthode permettant de notifier tous les observateurs lors d'un changement d'état
     */
    public void notifierObservateurs() {
        setChanged();// Méthode de l'API.
        notifyObservers();// Egalement une méthode de l'API.
    }

    /**
     * Méthode qui permet de mettre à jour de façon artificielle le GPS.
     *
     * @param position
     * @param precision
     */
    public void setMesures(String position, int precision) {
        this.position = position;
        this.precision = precision;
        notifierObservateurs();
    }

    public int getPrecision() {
        return precision;
    }

    public void setPrecision(int precision) {
        this.precision = precision;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Gps{" +
                "position='" + position + '\'' +
                ", precision=" + precision +
                '}';
    }
}
