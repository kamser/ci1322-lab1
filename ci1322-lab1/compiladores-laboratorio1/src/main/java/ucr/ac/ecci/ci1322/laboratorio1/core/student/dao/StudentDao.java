package ucr.ac.ecci.ci1322.laboratorio1.core.student.dao;

import ucr.ac.ecci.ci1322.laboratorio1.model.Student;

import java.sql.SQLException;

public interface StudentDao
{
    Student findById(String id) throws SQLException;
    String create(Student entity) throws SQLException;
}
