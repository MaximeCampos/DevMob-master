package com.example.devmobile.modele;

import java.util.ArrayList;

public class Projet {

    private int id;
    private int numéro;
    private Evaluateur encadrant;
    private ArrayList<Etudiant> listEtu;

    public Projet(int id, int numéro, Evaluateur encadrant, ArrayList<Etudiant> listEtu) {
        this.id = id;
        this.numéro = numéro;
        this.encadrant = encadrant;
        this.listEtu = listEtu;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNuméro() {
        return numéro;
    }

    public void setNuméro(int numéro) {
        this.numéro = numéro;
    }

    public Evaluateur getEncadrant() {
        return encadrant;
    }

    public void setEncadrant(Evaluateur encadrant) {
        this.encadrant = encadrant;
    }

    public ArrayList<Etudiant> getListEtu() {
        return listEtu;
    }

    public void setListEtu(ArrayList<Etudiant> listEtu) {
        this.listEtu = listEtu;
    }

    @Override
    public String toString() {
        return "Projet{" +
                "id=" + id +
                ", numéro=" + numéro +
                ", encadrant=" + encadrant +
                '}';
    }
}
