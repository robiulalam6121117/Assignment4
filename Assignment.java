/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;
import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
public class Assignment {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception
    {
       FileInputStream fis=new FileInputStream("C://Users//DELL//Downloads//poi-bin-4.1.2-20200217//poi-4.1.2//movies.xlsx");
       XSSFWorkbook workbook=new XSSFWorkbook(fis);
       XSSFSheet sheet=workbook.getSheet("movies");
       XSSFRow row=sheet.getRow(1);
       XSSFCell cell=row.getCell(2);
       
       String value=String.valueOf(cell.getStringCellValue());
       int rowsNum = sheet.getPhysicalNumberOfRows();
       System.out.println("Value of cell is : "+value);
       System.out.print("Total rows are :"+rowsNum+"\n");
       
    }
    
}
