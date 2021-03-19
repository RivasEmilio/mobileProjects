package com.example.testapp2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Context myContext;

    Toast myToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myContext = getApplicationContext();

        myToast = new Toast(myContext);

        AlertDialog.Builder dialogConf = new AlertDialog.Builder(this);
        dialogConf.setTitle("Do you wish to bing or bong");
        dialogConf.setMessage("be sure to choose wisely");
        dialogConf.setIcon(R.mipmap.ic_launcher);

        dialogConf.setNeutralButton("Bing", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                myToast.makeText(myContext, "You binged", Toast.LENGTH_LONG).show();
            }
        });

        dialogConf.setPositiveButton("Bong", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                myToast.makeText(myContext, "You bonged", Toast.LENGTH_LONG).show();
            }
        });

        AlertDialog myDialog = dialogConf.create();

        myDialog.show();

        Notification.Builder notifConf = new Notification.Builder(this);
        notifConf.setContentTitle("Be sure to boing or bong");
        notifConf.setContentText("Its important to do this!");
        notifConf.setSmallIcon(R.mipmap.ic_launcher);

        Intent myIntent = new Intent(this, ChildActivity.class);
        PendingIntent contentIntent = PendingIntent.getActivity(myContext, 0, myIntent, 0);
        notifConf.setContentIntent(contentIntent);

        NotificationManager myNotification = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        myNotification.notify(12345, notifConf.build());




    }
}