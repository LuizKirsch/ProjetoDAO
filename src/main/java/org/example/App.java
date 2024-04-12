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
        teste6();
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

    public static void teste5() throws Exception{
        AlunoDAO alunoDAO = new AlunoDAO();

        Aluno aluno = new Aluno();
        aluno.setNome("Oswaldo");
        aluno.setCpf("00000012343");
        aluno.setNumeroMatricula("1231");
        aluno.setNascimento(LocalDate.of(1997, 10, 25));

        Turma turma = new Turma();
        turma.setSemestre("2024/1");

        aluno.getTurmas().add(turma);

        alunoDAO.insere(aluno);
    }

    public static void teste6() throws Exception{
        AlunoDAO alunoDAO = new AlunoDAO();

        Aluno aluno = new Aluno();
        aluno.setId(4);
        aluno.setNome("Oswaldo editado");
        aluno.setCpf("00000012343");
        aluno.setNumeroMatricula("1231");
        aluno.setEndereco("ruas testes");
        aluno.setNascimento(LocalDate.of(1997, 10, 25));

        alunoDAO.atualiza(aluno);
    }

}
