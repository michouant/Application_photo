package com.example.antoine.application_photo;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Antoine on 27/05/2017.
 */

public class Photo {
    private String name;
    private int imageId;
    private int taille;
    private int coordGPS;
    private String date;

    public Photo(String name, int imageId, int taille,int coordGPS)
    {
        this.name=name;
        this.imageId=imageId;
        this.coordGPS=coordGPS;//à changer pour la fonction GPS
        this.date=Date_now();

    }

    //obtenir les caractéristiques des images
    public String getName(){return this.name;}
    public int getTaille(){return this.taille;}
    public int getImageId(){return this.imageId;}
    public int getCoordGSP(){return this.coordGPS;}
    public String getDate(){return this.date;}

    //mise à jour des images
    public void setName(String name){this.name=name;}
    public void setImageId (int imgId){this.imageId=imgId;}

    //renvoie la date actuel
    public String Date_now(){

        Date now = new Date();
        SimpleDateFormat f = new SimpleDateFormat("yyyyMMdd'T'HHmmss");
        String date = f.format(now);
        return date;

    }

}
