package com.example.digitalhouse.floatbuttonbase;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity implements SantaFragment.ActivityListener {

    private FragmentManager miFragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        llamarSantaFragment();
    }

    @Override
    public void notificarActivity(String mensaje, String regalos) {

        Bundle bundle = new Bundle();
        bundle.putString(MensajeActivity.CLAVE_MENSAJE,mensaje);
        bundle.putString(MensajeActivity.CLAVE_REGALOS,regalos);
        Intent intent = new Intent(MainActivity.this, MensajeActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    private void llamarSantaFragment(){
        FragmentManager fragmentManager = getSupportFragmentManager();
        SantaFragment santaFragment = new SantaFragment();
        FragmentTransaction fragmentTransaction =fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.contenedorDeFragmentsSanta,santaFragment);
        fragmentTransaction.commit();
    }

}
