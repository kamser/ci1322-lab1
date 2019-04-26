package ucr.ac.ecci.ci1322.laboratorio1.core.book.dao;

import ucr.ac.ecci.ci1322.laboratorio1.model.Book;

import java.sql.*;
import java.util.Properties;

public class JdbcBookDao implements BookDao{

    private String userName;
    private String password;

    public JdbcBookDao() throws ClassNotFoundException, SQLException {
        userName = "root";
        password = "020895.Key";
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://127.0.0.1:3306/atomite";
        Connection conn = DriverManager.getConnection(url, "root", "020895.Key");        //Hace la conexión con el DBMS de MySQL
        Statement stmt = conn.createStatement();
    }

    @Override
    public Book findById(String id) throws SQLException {
        Connection conn = null;
        Statement stmt = conn.createStatement();
        ResultSet rs;
        rs = stmt.executeQuery("SELECT * FROM Estudiantes");
        while ( rs.next() ) {
            String lastName = rs.getString("Lname");
            System.out.println(lastName);
        }
        return null;
    }

    @Override
    public String create(Book entity) throws SQLException {
        // create a Statement from the connection
        Connection conn = null;
        Statement statement = conn.createStatement();
        // insert the data
        statement.executeUpdate("INSERT INTO Estudiantes "
                                + "VALUES (1001, 'Simpson', 'Mr.', 'Springfield', 2001)");
        return null;
    }
}


//Para conectar la base con el driverManager se ocupa el método DriverManager.getConnection