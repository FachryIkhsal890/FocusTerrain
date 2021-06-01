package com.fachryikhsal.navdrawfromscratch;

import java.util.ArrayList;

public class DummyData {

    // Dalam tanggal
    private static String[] localTime = {
            "24 May","25 May","26 May","27 May"
    };

    // Dalam Menit
    private static long[] duration = {
            30,60,30,20
    };

    static ArrayList<DummyObject> getListData(){
     ArrayList<DummyObject> list = new ArrayList<>();
     for(int position = 0; position < localTime.length; position++){
         DummyObject dummyObject = new DummyObject();
         dummyObject.setDuration(duration[position]);
         dummyObject.setLocalTime(localTime[position]);
     }
        return list;
    }
}
