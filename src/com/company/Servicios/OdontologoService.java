package com.company.Servicios;

import com.company.DAO.IDaoOdontologo;
import com.company.Entidades.Odontologo;

import java.util.List;

public class OdontologoService {

    private IDaoOdontologo<Odontologo> odontologoIDao;

    public IDaoOdontologo<Odontologo> getOdontologoIDao() {
        return odontologoIDao;
    }

    public void setOdontologoIDao(IDaoOdontologo<Odontologo> odontologoIDao) {
        this.odontologoIDao = odontologoIDao;
    }

    public Odontologo agregarOdontologo(Odontologo o){
        return odontologoIDao.agregar(o);
    }

    public void eliminarOdontologo(Long id){
        odontologoIDao.eliminar(id);
    }

    public Odontologo listarOdontologo(Long id){
        return odontologoIDao.listar(id);
    }

}
