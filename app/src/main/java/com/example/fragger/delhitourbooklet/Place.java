package com.example.fragger.delhitourbooklet;

/**
 * Created by fragger on 2/6/16.
 */

public class Place {

    static int places_count = 8;
    static int currentPosition;
    static String Pname;
    static String Pdescription;
    static String PopenTime;
    static String PcloseTime;
    static String Pfees;
    static int PdescriptionImageId;

    static Integer images[]={
            R.drawable.img1,
            R.drawable.img2,
            R.drawable.img3,
            R.drawable.img4,
            R.drawable.img5,
            R.drawable.img6,
            R.drawable.img7,
            R.drawable.img8,
    };

    static void load(int i,String name[],String description[],String openTime[],String closeTime[],String fees[]) {
        currentPosition=i;
        PdescriptionImageId=images[i];
        Pname=new String("").concat(name[i]);
        Pdescription=new String("").concat(description[i]);
        PopenTime=new String("Open Time : ").concat(openTime[i]);
        PcloseTime=new String("Close Time : ").concat(closeTime[i]);
        Pfees=new String("Fees : ").concat(fees[i]);

    }
}
