package ucr.ac.ecci.ci1322.laboratorio1.core.student.dao;

import ucr.ac.ecci.ci1322.laboratorio1.model.Student;

import java.sql.*;

public class jdbcStudentDao implements StudentDao{

    public jdbcStudentDao() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://127.0.0.1:3306/atomite";
        Connection conn = DriverManager.getConnection(url, "root", "020895.Key");        //Hace la conexión con el DBMS de MySQL
        Statement stmt = conn.createStatement();
    }

    @Override
    public Student findById(String id) throws SQLException {
        Connection conn = null;
        Statement stmt = conn.createStatement();
        ResultSet rs;
        rs = stmt.executeQuery("SELECT" + id + "FROM Estudiantes");
        while ( rs.next() ) {
            String lastName = rs.getString("id");
            System.out.println(lastName);
        }
        return null;
    }

    @Override
    public String create (Student entity) throws SQLException {
        // create a Statement from the connection
        Connection conn = null;
        Statement statement = conn.createStatement();
        // insert the data
        statement.executeUpdate("INSERT INTO Estudiantes "
                + "VALUES (Juan, '1241232', 'A791238', '213901239', 'Eléctrica', 'EI-1231', 'Nandayure', '81922319', 'Montes de Oca', 45)");
        return null;
    }

}
