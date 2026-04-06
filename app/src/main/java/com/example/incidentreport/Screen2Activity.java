package com.example.incidentreport;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Screen2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);

        TextView tvRecap = findViewById(R.id.tv_recap_incident);
        Button btnRetour = findViewById(R.id.btn_fermer_ticket);

        // Ouvrir l'Intent reçue
        Intent intentRecu = getIntent();

        // Lire les mots-clés
        String rAgent = intentRecu.getStringExtra("clef_agent");
        String rEmail = intentRecu.getStringExtra("clef_email");
        String rMenace = intentRecu.getStringExtra("clef_menace");
        String rIp = intentRecu.getStringExtra("clef_ip");
        String rServeur = intentRecu.getStringExtra("clef_serveur");

        // Fabriquer le texte du rapport (le \n sert à passer à la ligne)
        String rapportFinal =
                " RAPPORT D'INCIDENT\n\n" +
                        "Agent Assigné : " + checkVide(rAgent) + "\n" +
                        "Contact SOC : " + checkVide(rEmail) + "\n" +
                        "Classification : " + checkVide(rMenace) + "\n" +
                        "IP Suspecte : " + checkVide(rIp) + "\n" +
                        "Cible : " + checkVide(rServeur);

        // Afficher le texte
        tvRecap.setText(rapportFinal);

        // Action du bouton retour (détruire l'écran)
        btnRetour.setOnClickListener(v -> finish());
    }

    // Petite fonction de sécurité pour ne pas afficher de "null" si un champ facultatif est vide
    private String checkVide(String texte) {
        return (texte == null || texte.isEmpty()) ? "[Non renseigné]" : texte;
    }
}
