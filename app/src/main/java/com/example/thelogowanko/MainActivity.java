package com.example.thelogowanko;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    public String login = "Dzionselka";
    public String hasło = "tablet";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.Logowanie);

        TextView blad = findViewById(R.id.prob);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                EditText log = (EditText)findViewById(R.id.TheLogin);
                String thelogin = log.getText().toString();
                EditText has = (EditText)findViewById(R.id.TheHaslo);
                String Thehas = has.getText().toString();

if (thelogin.length()<1 && Thehas.length()<1){

} else if(thelogin.length()<1)
{
    blad.setText("Brak podanego loginu");
}
else if(Thehas.length()<1)
{
    blad.setText("Brak podanego hasła");
}
else if(thelogin.equals(login) && Thehas.equals(hasło))
{
    startActivity(new Intent(MainActivity.this, zalogowano.class));
    blad.setText("zalogowano");
}
else if(thelogin != login && Thehas != hasło)
{
    blad.setText("nieprawidłowy login lub hasło");
}

            }
        });





    }

}