package com.example.antoine.application_photo;

import android.widget.ImageView;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Antoine on 27/05/2017.
 */

public class Photo {
    private String name;
    private int width;
    private int height;
    private int coordGPS;
    private String date;

    public Photo(String name, int width,int height,int coordGPS)
    {
        this.name=name;

        this.width=width;
        this.height=height;
        this.coordGPS=coordGPS;//à changer pour la fonction GPS
        this.date=Date_now();

    }

    //obtenir les caractéristiques des images
    public String getName(){return this.name;}
    public int getHeight(){return this.height;}
    public int getWidth(){return this.width;}
    public int getCoordGSP(){return this.coordGPS;}
    public String getDate(){return this.date;}

    //mise à jour des images
    public void setName(String name){this.name=name;}

    //renvoie la date actuel
    public String Date_now(){

        Date now = new Date();
        SimpleDateFormat f = new SimpleDateFormat("yyyyMMdd'T'HHmmss");
        String date = f.format(now);
        return date;

    }

}
