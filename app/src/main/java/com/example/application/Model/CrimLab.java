package com.example.application.Model;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CrimLab {
    private static CrimLab crimLab;
    private List<Crime> crimes;

    public static CrimLab get (Context context){
        if (crimLab ==null )
            crimLab = new CrimLab(context);
        return crimLab;
    }
    private CrimLab (Context context){
    crimes = new ArrayList<>();
    for(int i=0;i<100;i++){
        Crime crime = new Crime();
        crime.setTm("Crime"+(i+1));
        crimes.add(crime);

    }
    }


    public List<Crime> getCrimes() {
        return crimes;
    }

    public Crime getCrime(UUID ID){
        for (Crime crime:crimes) {
            if(crime.getId().equals(ID))
                return crime;
        }
        return null;
    }
}
