package com.company;

import com.company.DAO.OdontologoDAOH2;
import com.company.DAO.PacienteDAOH2;
import com.company.Entidades.Odontologo;
import com.company.Entidades.Paciente;
import com.company.Servicios.OdontologoService;
import com.company.Servicios.PacienteService;
import org.apache.log4j.Logger;

import java.util.Date;

public class Main {

    private static final Logger LOGGER = Logger.getLogger(Main.class);

    public static void main(String[] args) {

        // Odontologo

        /*Odontologo odontologo = new Odontologo(2L,"Nicolas","Olave",990629L);

        OdontologoService odontologoService = new OdontologoService();
        odontologoService.setOdontologoIDao(new OdontologoDAOH2());

        odontologoService.agregarOdontologo(odontologo);
        odontologoService.listarOdontologo(2L);*/

        // Paciente
        //Paciente paciente = new Paciente(2L,"Juan David","Alvarez","Carrera 1 #70-210",11654987L,"2021-10-23");
        PacienteService pacienteService = new PacienteService();
        pacienteService.setPacienteIDao(new PacienteDAOH2());
        //pacienteService.agregarPaciente(paciente);

        pacienteService.listarPaciente(2L);
    }
}
