package com.example.uaharoni.tourtheplace.view;

import android.support.design.widget.Snackbar;
import android.view.View;


public class utils {
    public static void displayFriendlyMessage(View layoutView, String message){
        Snackbar.make(layoutView,message,Snackbar.LENGTH_LONG)
                .show();
    }
}
