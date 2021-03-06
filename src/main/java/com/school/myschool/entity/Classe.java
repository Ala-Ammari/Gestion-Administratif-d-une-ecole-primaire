package com.school.myschool.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="Classe")
public class Classe {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private int classeId;
    @Column(name="classeNiveau")
    private int classeNiveau;
    @Column(name="classeName")
    private String classeName;
    @Column(name="nombre")
    private int nombre;
    @OneToMany(mappedBy="classe")
    private List<AffectationEnseignant> affectationEnseignant;
    @OneToMany(mappedBy="classe")
    private List<AffectationEleve> AffectationEleve;
    @ManyToMany(mappedBy = "Classe")
    private List<AnneeScolaire> AnneeScolaire;
    public Classe() {
    }

    public int getClasseId() {
        return classeId;
    }

    public void setClasseId(int classeId) {
        this.classeId = classeId;
    }

    public int getClasseNiveau() {
        return classeNiveau;
    }

    public void setClasseNiveau(int classeNiveau) {
        this.classeNiveau = classeNiveau;
    }

    public String getClasseName() {
        return classeName;
    }

    public void setClasseName(String classeName) {
        this.classeName = classeName;
    }

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }
}
