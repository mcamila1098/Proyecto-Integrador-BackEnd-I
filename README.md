Hola! Este es mi progreso en mi trabajo integrador de la materia Back End I 馃殌

## Sistema de reserva de turnos 馃枼

Se desea implementar un sistema que permita administrar la reserva de turnos para una cl铆nica odontol贸gica. Este debe cumplir con los siguientes requerimientos: <br>
<ul>
  <li><b>Administraci贸n de datos de odont贸logos</b>: listar, agregar, modificar y eliminar odont贸logos. Registrar apellido, nombre y matr铆cula de los mismos.</li>
  <li><b>Administraci贸n de datos de los pacientes</b>: listar, agregar, modificar y eliminar pacientes. De cada uno se almacenan: nombre, apellido, domicilio, DNI y fecha de alta.</li>
  <li><b>Registrar turno</b>: se tiene que poder permitir asignar a un paciente un turno con un odont贸logo a una determinada fecha y hora.</li>
  <li><b>Login</b>: validar el ingreso al sistema mediante un login con usuario y password. Se debe permitir a cualquier usuario logueado (ROLE_USER) registrar un turno, pero solo a quienes tengan un rol de administraci贸n (ROLE_ADMIN) poder gestionar odont贸logos y pacientes. Un usuario podr谩 tener un 煤nico rol y los mismos se ingresar谩n directamente en la base de datos.</li>