package com.roberts222.damian.contractconnection;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

public class RegisterActivity extends AppCompatActivity {

    TextView fname = findViewById(R.id.textView6);
    TextView lname = findViewById(R.id.textView7);
    TextView address = findViewById(R.id.textView8);
    TextView phone = findViewById(R.id.textView9);
    TextView availability = findViewById(R.id.textView3);
    TextView qualifications = findViewById(R.id.textView4);
    TextView services_offered = findViewById(R.id.textView5);
    User user;

    Button button = findViewById(R.id.register);
    //Intent loginIntent = new Intent(this, LoginActivity.class);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        //final Intent intent = getIntent();


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                NavController navController = Navigation.findNavController(RegisterActivity.this, R.id.registerActivity);
                navController.navigate(R.id.loginFragment);

                user = new User(fname.toString(),lname.toString(),address.toString(),phone.toString(),availability.toString(),qualifications.toString(),services_offered.toString());

            }
        });


    }
}
