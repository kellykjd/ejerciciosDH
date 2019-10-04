package com.example.comunicacioentrefragments20;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Bundle bundle = getIntent().getExtras();

        FragmentWelcome fragmentWelcome = new FragmentWelcome();

        fragmentWelcome.setArguments(bundle);

        pegarFragment(fragmentWelcome);

    }

    private void pegarFragment(Fragment fragment){
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.secondActivity_contenedorDeFragments,fragment,null)
                .commit();
    }
}
