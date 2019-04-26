package ucr.ac.ecci.ci1322.laboratorio1.core.book.dao;
//Cuando se hace uso del Patrón dao, se deben tener 3 clases como mínimo: una es la clase donde se tienen los datos, es la clase que representa al objeto que tiene atributos
//...; la otra es la clase dao, que es una interface, la cual permite realizar la abstracción del acceso a datos, sin importar la fuente...
//...; la otra es la clase que implementa la interface y sus métodos, en ella se hace el código para cada fuente que recupera datos de la clase objeto.
//... Por último existe la clase donde se prueba toda esa relación ternaria; entonces, la situación para la recuperación de datos es la siguiente:
//... la clase impl llama a métodos de la clase interface la cual usa a la clase objeto de la que se quiere recuperar datos

import ucr.ac.ecci.ci1322.laboratorio1.model.Book;

import java.sql.SQLException;

public interface BookDao{

    Book findById(String id) throws SQLException;
    String create(Book entity) throws SQLException;
}


/*https://www.geeksforgeeks.org/interfaces-in-java/   Para lo de las interfaces*/