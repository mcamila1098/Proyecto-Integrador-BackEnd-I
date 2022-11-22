package com.company.DAO;

import java.util.List;

public interface IDaoPaciente<T> {

    public T agregar(T t);
    public void eliminar(Long id);
    public T listar(Long id);

}
