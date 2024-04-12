package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;
import org.example.dao.AlunoDAO;
import org.example.entidades.Aluno;
import org.example.entidades.Turma;

import java.time.LocalDate;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception {
        lista();
    }

    public static void acha() throws Exception {
        AlunoDAO alunoDAO = new AlunoDAO();
        Aluno aluno = alunoDAO.obterPorId(1);

        System.out.println(aluno.getId());
        System.out.println(aluno.getNome());
        System.out.println(aluno.getNascimento());
        System.out.println(aluno.getEndereco());
        System.out.println(aluno.getNumeroMatricula());

        List<Turma> turmas = aluno.getTurmas();

        turmas.forEach(turma -> {
            System.out.println(turma.getId());
            System.out.println(turma.getSemestre());
        });
    }

    public static void cria() throws Exception {

        AlunoDAO alunoDAO = new AlunoDAO();

        Aluno aluno = new Aluno();
        aluno.setNome("Oswaldo");
        aluno.setCpf("002176253");
        aluno.setNumeroMatricula("00182");
        aluno.setNascimento(LocalDate.of(1997, 10, 25));

        alunoDAO.insere(aluno);

    }

    public static void lista() throws Exception {

        AlunoDAO alunoDAO = new AlunoDAO();
        Aluno aluno = alunoDAO.obterPorCpf("002176253");

        System.out.println(aluno.getId());
        System.out.println(aluno.getNome());
        System.out.println(aluno.getNascimento());
        System.out.println(aluno.getEndereco());
        System.out.println(aluno.getNumeroMatricula());

        List<Turma> turmas = aluno.getTurmas();

        turmas.forEach(turma -> {
            System.out.println(turma.getId());
            System.out.println(turma.getSemestre());
        });

    }

    public static void remove() throws Exception {

        AlunoDAO alunoDAO = new AlunoDAO();
        Aluno aluno = alunoDAO.obterPorId(1);

        System.out.println(aluno.getId());
        System.out.println(aluno.getNome());
        System.out.println(aluno.getNascimento());
        System.out.println(aluno.getEndereco());
        System.out.println(aluno.getNumeroMatricula());

        alunoDAO.remove(aluno);

    }

}
