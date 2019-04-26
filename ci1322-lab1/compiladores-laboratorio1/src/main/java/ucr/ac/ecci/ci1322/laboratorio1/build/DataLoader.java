package ucr.ac.ecci.ci1322.laboratorio1.build;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.ss.usermodel.Cell;
import ucr.ac.ecci.ci1322.laboratorio1.core.book.service.BookService;
import ucr.ac.ecci.ci1322.laboratorio1.core.student.service.StudentService;

import java.io.*;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.CellType;


public class DataLoader
{
    BookService servicioLibro;               //Casi todo en java son punteros, por eso cada vez que se crea una instacia se hace new
    StudentService servicioEstudiante;

    public DataLoader()
    {
        servicioLibro = null;
        servicioEstudiante = null;
    }

    public void loadLibros(HSSFSheet libro)
    {
        HSSFRow hssfRow;                                                  // Objeto que nos permite leer un fila de la hoja excel, y de aquí extraer el contenido de las celdas.

        HSSFCell cell;                                                    // Inicializo el objeto que leerá el valor de la celda

        int rows = libro.getLastRowNum();                             // Obtengo el número de filas ocupadas en la hoja

        //Seguidamente se Obtengo el número de columnas ocupadas en la hoja
        int cols = 0;

        String cellValue;                                                  // Cadena para almacenar la lectura de la celda

        for (int r = 0; r < rows; r++) {

            hssfRow = libro.getRow(r);                                  //Es una variable fila, que obtiene una fila del archivo.

            if (hssfRow == null){
                break;
            }else{
                System.out.print("Row: " + r + " -> ");

                for (int c = 0; c < (cols = hssfRow.getLastCellNum()); c++) {    //Esa función regresa la cantidad de celdas en reccorrido horizontal que fueron usadas en el archivo excel

                    cellValue = hssfRow.getCell(c) == null?"":
                            (hssfRow.getCell(c).getCellType() == Cell.CELL_TYPE_STRING)?hssfRow.getCell(c).getStringCellValue():
                                    (hssfRow.getCell(c).getCellType() == Cell.CELL_TYPE_NUMERIC)?"" + hssfRow.getCell(c).getNumericCellValue():
                                            (hssfRow.getCell(c).getCellType() == Cell.CELL_TYPE_BOOLEAN)?"" + hssfRow.getCell(c).getBooleanCellValue():
                                                    (hssfRow.getCell(c).getCellType() == Cell.CELL_TYPE_BLANK)?"BLANK":
                                                            (hssfRow.getCell(c).getCellType() == Cell.CELL_TYPE_FORMULA)?"FORMULA":
                                                                    (hssfRow.getCell(c).getCellType() == Cell.CELL_TYPE_ERROR)?"ERROR":"";
                    System.out.print("[Column " + c + ": " + cellValue + "] ");
                }
                System.out.println();
            }
        }
    }

    public void loadEstudiantes(HSSFSheet Estudiante)
    {
        HSSFRow hssfRow;                                                  // Objeto que nos permite leer un fila de la hoja excel, y de aquí extraer el contenido de las celdas.

        HSSFCell cell;                                                    // Inicializo el objeto que leerá el valor de la celda

        int rows = Estudiante.getLastRowNum();                             // Obtengo el número de filas ocupadas en la hoja

        //Seguidamente se Obtengo el número de columnas ocupadas en la hoja
        int cols = 0;

        String cellValue;                                                  // Cadena para almacenar la lectura de la celda

        for (int r = 0; r < rows; r++) {

            hssfRow = Estudiante.getRow(r);                                  //Es una variable fila, que obtiene una fila del archivo.

            if (hssfRow == null) {
                break;
            } else {
                System.out.print("Row: " + r + " -> ");

                for (int c = 0; c < (cols = hssfRow.getLastCellNum()); c++) {    //Esa función regresa la cantidad de celdas en reccorrido horizontal que fueron usadas en el archivo excel

                    cellValue = hssfRow.getCell(c) == null ? "" :
                            (hssfRow.getCell(c).getCellType() == Cell.CELL_TYPE_STRING) ? hssfRow.getCell(c).getStringCellValue() :
                                    (hssfRow.getCell(c).getCellType() == Cell.CELL_TYPE_NUMERIC) ? "" + hssfRow.getCell(c).getNumericCellValue() :
                                            (hssfRow.getCell(c).getCellType() == Cell.CELL_TYPE_BOOLEAN) ? "" + hssfRow.getCell(c).getBooleanCellValue() :
                                                    (hssfRow.getCell(c).getCellType() == Cell.CELL_TYPE_BLANK) ? "BLANK" :
                                                            (hssfRow.getCell(c).getCellType() == Cell.CELL_TYPE_FORMULA) ? "FORMULA" :
                                                                    (hssfRow.getCell(c).getCellType() == Cell.CELL_TYPE_ERROR) ? "ERROR" : "";
                    System.out.print("[Column " + c + ": " + cellValue + "] ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) throws IOException {
        FileInputStream fileIn = null;
        //FileOutputStream fileOut = null;
        DataLoader obj = new DataLoader();

        try
        {
            fileIn = new FileInputStream("C:\\Users\\Keylor Morataya\\Documents\\Semestre X\\Autom. y Compi\\Archivos Necesarios para labs\\compiladores-laboratorio1\\src\\resources\\libro.xls");
            POIFSFileSystem fs = new POIFSFileSystem(fileIn);
            HSSFWorkbook wb = new HSSFWorkbook(fs);
            HSSFSheet sheet = wb.getSheetAt(0);
            HSSFSheet sheet2 = wb.getSheetAt(1);

            obj.loadLibros(sheet);

            System.out.println("********************************************************************");

            obj.loadEstudiantes(sheet2);

            // Write the output to a file
            //fileOut = new FileOutputStream("libro.xls");
            //wb.write(fileOut);
        } finally{
            //if (fileOut != null)
                //fileOut.close();
            if (fileIn != null)
                fileIn.close();
        }
    }
}
