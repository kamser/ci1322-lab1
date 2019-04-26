package ucr.ac.ecci.ci1322.laboratorio1.core.book.service;

import ucr.ac.ecci.ci1322.laboratorio1.core.book.dao.JdbcBookDao;
import ucr.ac.ecci.ci1322.laboratorio1.model.Book;

import java.sql.SQLException;

public class BookServiceImpl implements BookService{

    private JdbcBookDao bDao;

    public BookServiceImpl() throws SQLException, ClassNotFoundException {
        bDao = new JdbcBookDao();
    }

    @Override
    public Book findById(String id) throws SQLException {
        return bDao.findById(id);
    }

    @Override
    public String create (Book entity) throws SQLException {
        return bDao.create(entity);
    }
}
