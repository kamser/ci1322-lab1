package ucr.ac.ecci.ci1322.laboratorio1.core.student.service;

import ucr.ac.ecci.ci1322.laboratorio1.core.student.dao.jdbcStudentDao;
import ucr.ac.ecci.ci1322.laboratorio1.model.Student;

import java.sql.SQLException;

public class StudentServiceImpl implements StudentService{

    private jdbcStudentDao sDao;

    public StudentServiceImpl() throws SQLException, ClassNotFoundException {
        sDao = new jdbcStudentDao();
    }

    @Override
    public Student findById(String id) throws SQLException {
        return sDao.findById(id);
    }

    @Override
    public String create (Student entity) throws SQLException {
        return sDao.create(entity);
    }

}
