/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.ss.usermodel.CellType;

public  class test {
    String cellvalue=null;
    FileInputStream fis= null;
       XSSFWorkbook workbook=null;
       XSSFSheet sheet=null;
       XSSFRow row=null;
       XSSFCell cell=null;
    
       
       public test(String xlFilePath) throws FileNotFoundException, IOException{

fis=new FileInputStream(xlFilePath);
workbook=new XSSFWorkbook(fis);
fis.close();

}
       public String getCelldata(String sheetname,int colnum,int rownum){
          
               sheet=workbook.getSheet(sheetname);
               row=sheet.getRow(rownum);
              //  rowsNum = sheet.getPhysicalNumberOfRows();
               cell=row.getCell(colnum);
               if(cell.getCellType()==CellType.STRING){
                   return cell.getStringCellValue();
               }
               
                else  if (cell.getCellType()==CellType.NUMERIC||cell.getCellType()==CellType.FORMULA){
                       cellvalue= String.valueOf(cell.getNumericCellValue());
                     return cellvalue;   
                }
                     else if(cell.getCellType()==CellType.BLANK){
                         return "";
                     }
               else
                         return "num";
                               
                   
          }
       public int countMaxRows(){
           int num =sheet.getLastRowNum();
           return num;
       }
              
       }
     
  

       
      



