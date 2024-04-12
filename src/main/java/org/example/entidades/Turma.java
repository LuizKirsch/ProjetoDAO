package org.example.entidades;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="turma")
public class Turma {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="semestre")
    private String semestre;

    @ManyToMany
    @JoinTable(name="aluno_turma", joinColumns = @JoinColumn(name="turma_id"),
                                    inverseJoinColumns = @JoinColumn(name="aluno_id"))
    private List<Aluno> alunos = new ArrayList<>();

    public Turma(int id, String semestre) {
        this.id = id;
        this.semestre = semestre;
    }

    public Turma() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    @Override
    public String toString() {
        return "Turma{" +
                "id=" + id +
                ", semestre='" + semestre + '\'' +
                '}';
    }

}
