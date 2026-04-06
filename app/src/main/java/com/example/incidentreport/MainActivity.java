package com.example.incidentreport;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText agent, email, menace, ip, serveur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Connexion Radar
        agent = findViewById(R.id.input_agent);
        email = findViewById(R.id.input_email);
        menace = findViewById(R.id.input_menace);
        ip = findViewById(R.id.input_ip);
        serveur = findViewById(R.id.input_serveur);

        Button btnGenerer = findViewById(R.id.btn_generer_ticket);

        // Action au clic
        btnGenerer.setOnClickListener(v -> {

            // Lire les informations tapées
            String sAgent = agent.getText().toString().trim();
            String sEmail = email.getText().toString().trim();
            String sMenace = menace.getText().toString().trim();
            String sIp = ip.getText().toString().trim();
            String sServeur = serveur.getText().toString().trim();

            // Sécurité : Vérifier les champs vitaux
            if (sAgent.isEmpty() || sMenace.isEmpty()) {
                Toast.makeText(this, "Agent et Menace sont obligatoires !", Toast.LENGTH_SHORT).show();
                return; // On bloque l'envoi
            }

            // Préparer Intent pour le deuxième écran
            Intent intent = new Intent(MainActivity.this, Screen2Activity.class);

            // Glisser les données dans Intent avec des mots-clés
            intent.putExtra("clef_agent", sAgent);
            intent.putExtra("clef_email", sEmail);
            intent.putExtra("clef_menace", sMenace);
            intent.putExtra("clef_ip", sIp);
            intent.putExtra("clef_serveur", sServeur);

            // 5. Envoyer Intent et ouvrir l'écran
            startActivity(intent);
        });
    }
}