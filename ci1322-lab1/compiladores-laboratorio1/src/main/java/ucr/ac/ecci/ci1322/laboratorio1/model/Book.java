package ucr.ac.ecci.ci1322.laboratorio1.model;

public class Book{
    private String NombreLibro;
    private String Autor;
    private String FechaLanzamiento;
    private String NumeroPaginas;
    private String SIDBI;
    private int Volumen;
    private String PaisOrigen;
    private String NombreEditorial;

    public Book(String NomLib, String Autor, String FechLanz, String NumPag, String SIDBI, int Vol, String PaisOri, String NomEdit)
    {
        NombreLibro = NomLib;
        this.Autor = Autor;
        FechaLanzamiento = FechLanz;
        NumeroPaginas = NumPag;
        this.SIDBI = SIDBI;
        Volumen = Vol;
        PaisOrigen = PaisOri;
        NombreEditorial = NomEdit;
    }

    public String getNombre_libro()
    {
        return NombreLibro;
    }

    public String getAutor()
    {
        return Autor;
    }

    public String getFecha_lanzamiento()
    {
        return FechaLanzamiento;
    }

    public String getNumero_Paginas()
    {
        return NumeroPaginas;
    }

    public String getSIDBI()
    {
        return SIDBI;
    }

    public int getVolumen()
    {
        return Volumen;
    }
}