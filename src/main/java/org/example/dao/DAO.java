package org.example.dao;

import java.util.List;

public interface DAO <T, U>{
    public T obterPorId(U id) throws Exception;
    public List<T> obterTodos() throws Exception;
    public void insere(T objeto) throws Exception;
    public void atualiza(T objeto) throws Exception;
    public void remove(T objeto) throws Exception;
}
