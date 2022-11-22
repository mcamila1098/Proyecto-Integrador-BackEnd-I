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

        Odontologo odontologo = new Odontologo(10L,"Nelcy","Portilla",543627L);

        OdontologoService odontologoService = new OdontologoService();
        odontologoService.setOdontologoIDao(new OdontologoDAOH2());

        //odontologoService.agregarOdontologo(odontologo);
        odontologoService.listarOdontologo(1L);

        try{
            // Pacientes en progreso aún
            Paciente paciente = new Paciente(1L,"Ofir","Rojas","Calle 10 #20-44",66816086L,new Date());
            PacienteService pacienteService = new PacienteService();
            pacienteService.setPacienteIDao(new PacienteDAOH2());
            pacienteService.agregarPaciente(paciente);

        }catch (Exception e){
            LOGGER.error("Error al insertar paciente");
        }

    }
}
