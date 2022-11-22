package com.company.Servicios;

import com.company.DAO.IDaoPaciente;
import com.company.Entidades.Paciente;

public class PacienteService {
    private IDaoPaciente<Paciente> pacienteIDao;

    public IDaoPaciente<Paciente> getPacienteIDao() {
        return pacienteIDao;
    }

    public void setPacienteIDao(IDaoPaciente<Paciente> pacienteIDao) {
        this.pacienteIDao = pacienteIDao;
    }

    public Paciente agregarPaciente(Paciente p){return pacienteIDao.agregar(p);}
    public void eliminarPaciente(Long id){pacienteIDao.eliminar(id);}
    public Paciente listarPaciente(Long id){
        return pacienteIDao.listar(id);
    }
}
