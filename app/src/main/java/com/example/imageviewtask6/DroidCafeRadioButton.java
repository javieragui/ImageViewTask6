package com.example.imageviewtask6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class DroidCafeRadioButton extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_droid_cafe_radio_button);
    }

    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message,Toast.LENGTH_SHORT).show();
    }

    public void showRadioButtonClicked(View view){
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()){
            case R.id.sameday:
                if(checked){
                    displayToast("Chosen: Same day messenger service.");
                }
                break;
            case R.id.nextday:
                if(checked){
                    displayToast("Chosen: Next day ground delivery.");
                }
                break;
            case R.id.pickup:
                if(checked){
                    displayToast("Chosen: Pick Up.");
                }
                break;
        }
    }
}
