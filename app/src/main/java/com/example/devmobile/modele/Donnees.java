package com.example.devmobile.modele;

import java.util.ArrayList;

public class Donnees {

    Etudiant e1 = new Etudiant(1,"Roustan","Didier");

    Etudiant e2 = new Etudiant(2,"abc","def");

    Evaluateur ev1 = new Evaluateur(1,"Laroche","Pierre","pierrelaroche@gmail.com","1234");

    ArrayList<Etudiant> listE = new ArrayList<Etudiant>();

    public void main(){
    listE.add(e1);
    listE.add(e2);
    Projet p1 = new Projet(1,21,ev1,listE);
    }
}
