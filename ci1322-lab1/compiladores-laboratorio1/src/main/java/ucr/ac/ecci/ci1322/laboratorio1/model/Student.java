package ucr.ac.ecci.ci1322.laboratorio1.model;

public class Student
{
    private String NombreEstudiante;
    private String id;
    private String carne;
    private String fechaNacimiento;
    private String carreraPrincipal;
    private String codigoCarrera;
    private String lugarNacimiento;
    private int numeroTel;
    private String lugarRecidencia;
    private int edad;

    public Student (String Nomb_estu, String id, String ca, String fec_Nac, String carr_prin, String cod_carr, String lug_Nac, int num_tel, String lug_reci, int edad)
    {
        NombreEstudiante = Nomb_estu;
        this.id = id;
        carne = ca;
        fechaNacimiento = fec_Nac;
        carreraPrincipal = carr_prin;
        codigoCarrera = cod_carr;
        lugarNacimiento = lug_Nac;
        numeroTel = num_tel;
        lugarRecidencia = lug_reci;
        this.edad = edad;
    }

    public String getNombre_estudiante()
    {
        return NombreEstudiante;
    }

    public String getId()
    {
        return id;
    }

    public String getCarne()
    {
        return carne;
    }

    public String getFecha_Nacimiento()
    {
        return fechaNacimiento;
    }

    public String getCarreraPrincipal()
    {
        return carreraPrincipal;
    }

    public String getCodigoCarrera()
    {
        return codigoCarrera;
    }

    public String getLugarNacimiento()
    {
        return lugarNacimiento;
    }

    public int getNumeroTel()
    {
        return numeroTel;
    }

    public String getLugarRecidencia()
    {
        return lugarRecidencia;
    }

    public int getEdad()
    {
        return  edad;
    }

}