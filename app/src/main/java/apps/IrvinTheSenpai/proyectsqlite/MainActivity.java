package apps.IrvinTheSenpai.proyectsqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class MainActivity extends AppCompatActivity {

    //Views
    private FloatingActionButton addRecordBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Inicializar Vista
        addRecordBtn = findViewById(R.id.addRecordBtn);

        // Click para Iniciar a añadir y grabar en la activity
        addRecordBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Iniciar la Activity
                startActivity(new Intent(MainActivity.this, AgregarRegistroActivity.class));
            }
        });
    }
}
