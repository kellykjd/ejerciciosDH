package com.example.navigationview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout drawerLayout;
    private NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawerLayout = findViewById(R.id.drawerLayout);
        navigationView = findViewById(R.id.navigationView);

    navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

        Integer id = menuItem.getItemId();

        switch (id){
            case R.id.menuPrincipal_favoritos:
                //pegarFragment(); por ejemplo
                Toast.makeText(this,"el usuario quiere ir a favoritos",Toast.LENGTH_SHORT).show();
                break;
            case R.id.menuPrincipal_log_out:
                Toast.makeText(this,"Logout exitoso",Toast.LENGTH_SHORT).show();
                break;
            case R.id.menuPrincipal_perfil:
                Toast.makeText(this,"Entrada al perfil exitoso",Toast.LENGTH_SHORT).show();
                break;
            case R.id.menuPrincipal_settings:
                Toast.makeText(this,"Settings",Toast.LENGTH_SHORT).show();
                break;
        }
        drawerLayout.closeDrawers();
        return false;
    }
}
