package com.example.cloudfirestore;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private Button botonEscribir;
    private Button botonLeer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        botonEscribir= findViewById(R.id.botonEscribir);
        botonLeer= findViewById(R.id.botonLeer);
        botonEscribir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                escribirFirebase();
            }
        });
        botonLeer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                leerFirebase();
            }
        });

    }

    private void escribirFirebase(){
        // Access a Cloud Firestore instance from your Activity
        FirebaseFirestore db = FirebaseFirestore.getInstance();

        Map<String,String> unUsuario = new HashMap<>();
        unUsuario.put("nombre","Kelly");
        unUsuario.put("apellido","Jiménez");
        unUsuario.put("edad","25");

        db.collection("usuarios")
                .add(unUsuario)
                .addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
                    @Override
                    public void onSuccess(DocumentReference documentReference) {
                        Toast.makeText(MainActivity.this, "Registro Correcto", Toast.LENGTH_SHORT).show();
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(MainActivity.this, "Todo mal", Toast.LENGTH_SHORT).show();
                    }
                });
    }

    private void leerFirebase(){
        FirebaseFirestore db = FirebaseFirestore.getInstance();
        db.collection("usuarios").get().addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
            @Override
            public void onComplete(@NonNull Task<QuerySnapshot> task) {
                if (task.isSuccessful()){
                    QuerySnapshot result = task.getResult();
                    for (DocumentSnapshot document : result.getDocuments()){
                        System.out.println(document.getData());
                    }
                }else{
                    Toast.makeText(MainActivity.this, "Todo está mal", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
