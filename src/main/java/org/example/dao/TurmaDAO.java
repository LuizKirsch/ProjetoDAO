package org.example.dao;

import org.example.entidades.Turma;

public class TurmaDAO extends DAOGenerics <Turma, Integer> {

    public TurmaDAO(Class<Turma> persistedClass) throws Exception {
        super(persistedClass);
    }

}
