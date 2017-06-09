package com.example.antoine.application_photo;

import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.io.File;
import java.util.ArrayList;



public class MainActivity extends AppCompatActivity {
    private ListView vue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_main);


        //  vue = (ListView) findViewById(R.id.listView);

        //bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb
        //aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa

        String[] nom = new String[]{"image1", "image2"};

        int[] num = new int[]{11, 12, 13, 14};
        //  int[] image = { R.drawable.smileybase, R.drawable.smileybase};

        ArrayList<Photo> myList = new ArrayList<>();
/*
        ImageIcon bimg = new ImageIcon() {
        }
        int width = bimg.getWidth();
        int height= bimg.getHeight();
*/
        for (int i = 0; i < num.length; i++) {
            int imageId=i;
            int taille=i*10;
            int coordGPS=i*100;//CoordGPS et taille à implémenter
            myList.add(new Photo(nom[i],imageId,taille,coordGPS));
        }

        Liste_Photo adapter = new Liste_Photo(this, myList);
        vue.setAdapter(adapter);
    }





}
