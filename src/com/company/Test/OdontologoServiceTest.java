package com.company.Test;

import org.junit.jupiter.api.Test;
import com.company.DAO.IDaoOdontologo;
import com.company.DAO.OdontologoDAOH2;
import com.company.Entidades.Odontologo;
import com.company.Servicios.OdontologoService;
import org.junit.Assert;

import static org.junit.jupiter.api.Assertions.*;

class OdontologoServiceTest {
    private IDaoOdontologo<Odontologo> odontologoDAOH2 = new OdontologoDAOH2();
    private OdontologoService odontologoService = new OdontologoService();

    @Test
    public void listarOdotonlogoDAO(){
        odontologoService.setOdontologoIDao(odontologoDAOH2);
        odontologoService.agregarOdontologo(new Odontologo(2L,"Nicolás","Olave",786534L));
    }




}