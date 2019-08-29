package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.pm.ActivityInfo;
import android.hardware.ConsumerIrManager;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageButton power;
    ImageButton mute;
    ImageButton minusb;
    ImageButton plusb;
    ImageButton line1b;
    ImageButton line2b;
    ImageButton opticalb;
    ImageButton coaxialb;
    ImageButton bluetoothb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        power = (ImageButton) findViewById(R.id.power);
        mute = (ImageButton) findViewById(R.id.mute);
        minusb = (ImageButton) findViewById(R.id.minus);
        plusb = (ImageButton) findViewById(R.id.plus);
        line1b = (ImageButton) findViewById(R.id.line1);
        line2b = (ImageButton) findViewById(R.id.line2);
        opticalb = (ImageButton) findViewById(R.id.opt);
        coaxialb = (ImageButton) findViewById(R.id.coaxial);
        bluetoothb = (ImageButton) findViewById(R.id.bluet);
        final String errIr = "The device is not equipped with an IR port";
        final ConsumerIrManager consumerIrManager = (ConsumerIrManager) this.getSystemService(Context.CONSUMER_IR_SERVICE);
        final int frequency = 36000;
        final int[] volume_plus = new int[]{8900,4500, 550,600, 550,550, 550,600, 550,550, 600,1650, 550,600, 550,550, 550,600, 550,1650, 600,1650, 600,1650, 600,550, 550,550, 600,1650, 600,1650, 600,1650, 600,1650, 600,550, 550,550, 600,1650, 600,550, 550,550, 600,550, 550,550, 600,550, 550,1650, 600,1650, 600,550, 600,1650, 600,1650, 600,1650, 600,1650, 600};
        final int[] volume_minus = new int[]{8900,4450, 600,550, 600,500, 600,550, 600,500, 600,1650, 600,550, 600,500, 600,550, 600,1650, 600,1650, 600,1650, 550,550, 600,500, 600,1650, 600,1650, 600,1650, 600,550, 600,500, 600,1650, 600,1650, 600,550, 600,500, 600,550, 600,550, 550,1650, 600,1650, 600,550, 550,600, 550,1650, 600,1650, 600,1650, 600,1650, 600};
        final int[] on_off = new int[]{8950,4450, 600,500, 600,550, 600,500, 600,550, 600,1650, 600,500, 600,550, 600,500, 600,1650, 600,1650, 600,1650, 600,550, 600,500, 600,1650, 600,1650, 600,1650, 600,500, 600,550, 600,500, 600,550, 600,500, 600,550, 600,550, 550,550, 600,1650, 600,1650, 600,1650, 600,1650, 600,1650, 600,1650, 600,1650, 550,1700, 550};
        final int[] mute_device = new int[]{8950,4450, 600,500, 600,550, 600,500, 600,550, 600,1650, 600,500, 650,500, 600,500, 650,1600, 650,1600, 650,1600, 650,500, 600,500, 650,1600, 600,1650, 600,1650, 650,1600, 600,550, 600,500, 650,500, 600,500, 650,500, 600,500, 600,550, 600,500, 600,1650, 600,1650, 600,1650, 600,1650, 600,1650, 600,1650, 600,1650, 600};
        final int[] line1 = new int[]{8950,4450, 600,500, 650,500, 600,500, 650,500, 600,1650, 600,500, 650,500, 600,500, 600,1650, 600,1650, 600,1650, 600,500, 650,500, 600,1650, 600,1650, 600,1650, 600,500, 650,1600, 650,500, 600,1600, 650,500, 600,500, 650,500, 600,500, 650,1600, 650,500, 600,1650, 600,500, 650,1600, 650,1600, 650,1600, 650,1600, 650};
        final int[] line2 = new int[]{8950,4450, 600,500, 600,550, 600,500, 600,550, 600,1650, 600,500, 600,550, 550,550, 600,1650, 600,1650, 600,1650, 600,500, 600,550, 600,1650, 600,1650, 600,1650, 600,1650, 600,500, 600,1650, 600,550, 600,1650, 600,500, 600,550, 600,500, 600,550, 600,1650, 550,550, 600,1650, 600,550, 600,1600, 600,1650, 600,1650, 600};
        final int[] coaxial = new int[]{9000,4400, 600,500, 650,500, 650,450, 650,500, 600,1650, 600,500, 650,500, 600,500, 650,1600, 650,1600, 650,1600, 650,500, 600,500, 650,1600, 650,1600, 650,1600, 600,500, 650,1600, 650,1600, 650,500, 600,1650, 600,500, 650,500, 600,500, 650,1600, 650,500, 600,500, 650,1600, 650,500, 600,1650, 600,1650, 600,1650, 600};
        final int[] opt = new int[]{8950,4450, 600,550, 600,550, 550,550, 600,550, 550,1650, 600,550, 550,600, 550,550, 550,1650, 600,1650, 600,1650, 600,550, 600,550, 550,1650, 600,1650, 600,1650, 600,1650, 600,550, 600,1650, 600,1650, 600,550, 550,550, 600,550, 550,550, 550,600, 550,1650, 600,550, 550,600, 550,1650, 600,1650, 600,1650, 600,1650, 600};
        final int[] bluetooth = new int[]{9000,4400, 600,500, 600,500, 650,500, 600,500, 650,1600, 650,500, 600,500, 650,500, 600,1650, 600,1650, 600,1650, 600,500, 650,500, 600,1650, 600,1650, 600,1650, 650,450, 650,1600, 600,1650, 600,1650, 600,500, 650,500, 600,500, 600,550, 600,1650, 600,500, 600,550, 650,450, 600,1650, 600,1650, 650,1600, 650,1600, 650};
        // consumerIrManager.transmit(frequency, pattern);

        power.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    consumerIrManager.transmit(frequency, on_off);
                }
                catch(UnsupportedOperationException e)
                {
                    Toast toast = Toast.makeText(getApplicationContext(),
                            errIr, Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });

        mute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    consumerIrManager.transmit(frequency, mute_device);
                    }
                catch(UnsupportedOperationException e)
                {
                    Toast toast = Toast.makeText(getApplicationContext(),
                            errIr, Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });

        minusb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    consumerIrManager.transmit(frequency, volume_minus);
                }
                catch(UnsupportedOperationException e)
                {
                    Toast toast = Toast.makeText(getApplicationContext(),
                            errIr, Toast.LENGTH_SHORT);
                    toast.show();
                }

            }
        });

        plusb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    consumerIrManager.transmit(frequency, volume_plus);
                }
                catch(UnsupportedOperationException e)
                {
                    Toast toast = Toast.makeText(getApplicationContext(),
                            errIr, Toast.LENGTH_SHORT);
                    toast.show();
                }

            }
        });

        line1b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    consumerIrManager.transmit(frequency, line1);
                }
                catch(UnsupportedOperationException e)
                {
                    Toast toast = Toast.makeText(getApplicationContext(),
                            errIr, Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });

        line2b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    consumerIrManager.transmit(frequency, line2);
                }
                catch(UnsupportedOperationException e)
                {
                    Toast toast = Toast.makeText(getApplicationContext(),
                            errIr, Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });

        opticalb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    consumerIrManager.transmit(frequency, opt);
                }
                catch(UnsupportedOperationException e)
                {
                    Toast toast = Toast.makeText(getApplicationContext(),
                            errIr, Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });

        coaxialb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    consumerIrManager.transmit(frequency, coaxial);
                }
                catch(UnsupportedOperationException e)
                {
                    Toast toast = Toast.makeText(getApplicationContext(),
                            errIr, Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });
        bluetoothb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    consumerIrManager.transmit(frequency, bluetooth);
                }
                catch(UnsupportedOperationException e)
                {
                    Toast toast = Toast.makeText(getApplicationContext(),
                            errIr, Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });
    }
}
