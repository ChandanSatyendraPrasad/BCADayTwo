package chandan.prasad.bcadaytwo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button_click;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button_click=findViewById(R.id.click);
    }

    public void chandan(View view) {
        Intent intent_new = new Intent(MainActivity.this,Welcome.class);
        startActivity(intent_new);
    }
}