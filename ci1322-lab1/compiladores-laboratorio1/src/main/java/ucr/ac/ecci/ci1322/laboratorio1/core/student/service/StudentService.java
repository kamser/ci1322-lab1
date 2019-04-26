package ucr.ac.ecci.ci1322.laboratorio1.core.student.service;

import ucr.ac.ecci.ci1322.laboratorio1.model.Student;

import java.sql.SQLException;

//La interface es la que ayuda a que el acceso a los datos no sea restrictivo, crea una abstración para que se puedan recuperar los datos de ditintas formas independientes
public interface StudentService
{
    Student findById(String id) throws SQLException;
    String create(Student entity) throws SQLException;
}


//Los dao resuelven problemas de acceso a datos, por el manejo de varias fuentes de datos; lo que hace es abstraer la forma en que se accesan a ellos.
//Hace que el acceso a datos no sea limitado y exclusivo, con la posibilidad de que se pueda entrar y obtener los datso de diferentes formas, según la situación.