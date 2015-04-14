package com.patterns.sample.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by s.ahmedouali on 14/04/2015.
 */
public class GPSObserver implements Observer
{
    // Méthode appelée automatiquement lors d'un changement d'état du GPS.
    public void update(Observable o, Object obj)
    {
        if(o instanceof GPS)
        {
            GPS gps = (GPS) o;
            System.out.println(gps);
        }
    }

}
