package miscProgram;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.File;
import java.io.IOException;

public class ReadAndWriteFromExcel {

    public void readExcel(String path){
        Workbook wb=null;
        Sheet sheet=null;
        String value=null;

        File file = new File(path);
        try {
            wb = WorkbookFactory.create(file);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //get sheet
        sheet =  wb.getSheet("sheetName");

        //get row
        Row row = sheet.getRow(0);

        //get Cell value
        row.getCell(0);

        //set cell value
        row.getCell(2).setCellValue("4");
    }

    public void createExcel(){
        //creating xlxs
        HSSFWorkbook wb = new HSSFWorkbook();

        //creating sheet
        HSSFSheet sheet = wb.createSheet("amar");

        //create row
        HSSFRow row = sheet.createRow((short) 0);

        //create cell
        row.createCell(0).setCellValue("amar");

    }
    

}
