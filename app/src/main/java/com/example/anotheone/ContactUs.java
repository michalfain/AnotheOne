package com.example.anotheone;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ContactUs extends AppCompatActivity {
    EditText etNmame, etEmail, etSubject, etMessage;
    int MY_PERMITION_REQUEST_SMS = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);

        etNmame = findViewById(R.id.etName);
        etEmail = findViewById(R.id.etEmail);
        etSubject = findViewById(R.id.etSubject);
        etMessage = findViewById(R.id.etMassage);
    }

    public void sendSms(View v){
        String massage = etNmame.getText().toString() + " " + etEmail.getText().toString() + " " + etMessage.getText().toString().trim();
        String number = "0524610919";

        if(ContextCompat.checkSelfPermission(this, Manifest.permission.SEND_SMS) != PackageManager.PERMISSION_GRANTED){

            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.SEND_SMS}, MY_PERMITION_REQUEST_SMS);
        }else {
            SmsManager sms = SmsManager.getDefault();
            sms.sendTextMessage(number, null, massage, null, null);

            etNmame.setText("");
            etEmail.setText("");
            etSubject.setText("");
            etMessage.setText("");

            Toast.makeText(this, "Thank for your feedback!", Toast.LENGTH_LONG).show();
        }
    }
}
