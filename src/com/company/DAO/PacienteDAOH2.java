package com.company.DAO;

import com.company.Entidades.Paciente;
import org.apache.log4j.Logger;

import java.sql.*;

public class PacienteDAOH2 implements IDaoPaciente<Paciente> {

    private final static String DB_JDBC_DRIVER = "org.h2.Driver";
    private final static String DB_URL = "jdbc:h2:~/test;INIT=RUNSCRIPT FROM 'create.sql'";
    private  final static String DB_USER = "sa";
    private final static String DB_PASSWORD = "";

    private static final Logger LOGGER = Logger.getLogger(PacienteDAOH2.class);

    @Override
    public Paciente agregar(Paciente paciente) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            // Conexión
            Class.forName(DB_JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
            connection.setAutoCommit(false);

            // Sentencia para insertar
            preparedStatement = connection.prepareStatement("INSERT INTO PACIENTES VALUES(?,?,?,?,?,?)");
            preparedStatement.setLong(1,paciente.getId());
            preparedStatement.setString(2,paciente.getNombre());
            preparedStatement.setString(3,paciente.getApellido());
            preparedStatement.setString(4,paciente.getDomicilio());
            preparedStatement.setLong(5,paciente.getDNI());
            preparedStatement.setString(6,paciente.getFechaDeAlta());

            // Ejecutar la sentencia
            preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.commit();
            connection.setAutoCommit(true);

            LOGGER.debug("Se agregó un paciente");

        } catch (ClassNotFoundException | SQLException e) {
            LOGGER.error("Error en el insert del paciente");
        }

        return paciente;
    }

    @Override
    public void eliminar(Long id) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            // Conexión
            Class.forName(DB_JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
            connection.setAutoCommit(false);

            // Sentencia para eliminar
            preparedStatement = connection.prepareStatement("DELETE FROM PACIENTES WHERE ID=?");
            preparedStatement.setLong(1,id);

            // Ejecutar la sentencia
            preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.commit();
            connection.setAutoCommit(true);

            LOGGER.debug("Se eliminó un paciente");

        } catch (ClassNotFoundException | SQLException e) {
            LOGGER.error("Error en el delete del paciente");
        }
    }

    @Override
    public Paciente listar(Long id) {
        return null;
    }
}
