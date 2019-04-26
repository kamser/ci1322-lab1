package ucr.ac.ecci.ci1322.laboratorio1.core.book.service;

import ucr.ac.ecci.ci1322.laboratorio1.model.Book;

import java.sql.SQLException;

public interface BookService
{
    Book findById(String id) throws SQLException;
    String create(Book entity) throws SQLException;
}
