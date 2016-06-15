package matrial.aka.bokly;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.stephentuso.welcome.WelcomeScreenHelper;
import com.stephentuso.welcome.ui.WelcomeActivity;

public class MainActivity extends AppCompatActivity {
    WelcomeScreenHelper welcomeScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        welcomeScreen = new WelcomeScreenHelper(this, Intro.class);
        welcomeScreen.show(savedInstanceState);

        findViewById(R.id.show_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                welcomeScreen.forceShow();

            }
        });


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == WelcomeScreenHelper.DEFAULT_WELCOME_SCREEN_REQUEST) {
            String welcomeKey = data.getStringExtra(WelcomeActivity.WELCOME_SCREEN_KEY);

            if (resultCode == RESULT_OK) {
                Toast.makeText(getApplicationContext(), welcomeKey + " completed", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(getApplicationContext(), welcomeKey + " canceled", Toast.LENGTH_SHORT).show();
            }

        }

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        welcomeScreen.onSaveInstanceState(outState);

    }



}

