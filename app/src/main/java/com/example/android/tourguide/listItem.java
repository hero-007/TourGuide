package com.example.android.tourguide;

/**
 * Created by HP on 6/27/2017.
 */

public class listItem {

    private String numText;
    private String placeName;
    private int placePic;
    private String placeInfo;
    private double d1;
    private double d2;


    public listItem(String A, String B, int C, String D,double E, double F){
        numText = A;
        placeName = B;
        placePic = C;
        placeInfo = D;
        d1=E;
        d2=F;
    }

    public String getNumText()
    {
        return numText;
    }

    public String getPlaceName()
    {
        return placeName;
    }

    public int getPlacePic(){
        return placePic;
    }

    public String getPlaceInfo(){
        return placeInfo;
    }

    public double getD1(){
        return d1;
    }

    public double getD2() {
        return d2;
    }
}
