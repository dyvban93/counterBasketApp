package com.projects.bakota.compteurpointsbasket;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int score_equipe_a = 0, score_equipe_b = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void resetScore(View view) {
        score_equipe_a = 0;
        score_equipe_b = 0;
        afficherScoreEquipeA(score_equipe_a);
        afficherScoreEquipeB(score_equipe_b);
    }

    public void ajouterTroisPoints(View view) {

        //on cherche à savoir qui a déclencher l'action
        int id = view.getId(); //ici j'ai l'id du bouton qui a appelé
        if(id == R.id.trois_pt_eqp_a){
            // je sais que c'est pour ajouter trois points à l'équipe A
            score_equipe_a += 3; //je lui ajoute 3 points
            afficherScoreEquipeA(score_equipe_a); // et j'affiche
        }else{
            score_equipe_b += 3;
            afficherScoreEquipeB(score_equipe_b);
        }
    }


    public void ajouterUnPoint(View view) {
        int id = view.getId(); //ici j'ai l'id du bouton qui a appelé
        if(id == R.id.deux_pt_eqp_a){
            // je sais que c'est pour ajouter trois points à l'équipe A
            score_equipe_a += 2; //je lui ajoute 3 points
            afficherScoreEquipeA(score_equipe_a); // et j'affiche
            return;
        }

        if (id == R.id.deux_pt_eqp_b){
            score_equipe_b += 2;
            afficherScoreEquipeB(score_equipe_b);
            return;
        }
    }

    public void ajouterDeuxPoints(View view) {
        int id = view.getId(); //ici j'ai l'id du bouton qui a appelé
        if(id == R.id.un_pt_eqp_a){
            // je sais que c'est pour ajouter trois points à l'équipe A
            score_equipe_a += 1; //je lui ajoute 3 points
            afficherScoreEquipeA(score_equipe_a); // et j'affiche
        }else{
            score_equipe_b += 1;
            afficherScoreEquipeB(score_equipe_b);
        }
    }

    public void afficherScoreEquipeA(int score){

        TextView textView_score_a = (TextView ) findViewById(R.id.equipe_a_score);
        textView_score_a.setText(""+score);
    }


    public void afficherScoreEquipeB(int score){

        TextView textView_score_b = (TextView ) findViewById(R.id.equipe_b_score);
        textView_score_b.setText(""+score);
    }
}
