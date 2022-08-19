package com.example.mydialog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        MaterialAlertDialogBuilder builder = new MaterialAlertDialogBuilder(this, R.style.AlertDialogTheme);
        //builder.setTitle("Hello").setIcon(R.drawable.ic_baseline_call_24);         //set icon
        builder.setTitle("Title")
                .setMessage("Message")
                .setNeutralButton("Cancel",(dialog, which) -> {
                    dialog.cancel();
                    //Respond to neutral button press
                })
                .setNegativeButton("Decline",(dialog, which)->{
                    //Respond to negative button press
                })
                .setPositiveButton("Ok",(dialog, which) -> {
                    dialog.dismiss();
                    //Respond to positive button press
                    //runImport(context, null);  //function logic
                });
        builder.show();
    }
}