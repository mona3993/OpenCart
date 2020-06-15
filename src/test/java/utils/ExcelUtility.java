package utils;

import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.FileInputStream;

public class ExcelUtility {
    public static Workbook wb = null;
    public static Sheet sh = null;

    public static void excelConfig(String pathname) throws Exception {
        File src = new File(pathname);
        FileInputStream fis = new FileInputStream(src);
        Workbook wb = WorkbookFactory.create(fis);
        sh = wb.getSheetAt(0);
    }

    public static String read_from_excel(String pathname,int rowno, int cellno) throws Exception{
        String value = null;
        excelConfig(pathname);
        Row r = sh.getRow(rowno);
        Cell c = r.getCell(cellno);
        DataFormatter df = new DataFormatter();
        value = df.formatCellValue(c);
        return value;
    }

    public static void review_excel_config() throws Exception{
        File fh = new File("./resource/Review.xlsx");
        FileInputStream fis = new FileInputStream(fh);
        Workbook wb = WorkbookFactory.create(fis);
        sh = wb.getSheetAt(0);
    }
    public static String read_from_review_excel(int rowno, int cellno) throws Exception {
        String value = null;
        review_excel_config();
        Row r = sh.getRow(rowno);
        Cell c = r.getCell(cellno);
        DataFormatter df = new DataFormatter();
        value = df.formatCellValue(c);
        return value;
    }


//    public static void write_into_excel(int rowno, int celno)throws Exception {
//        excelConfig();
//    }
}
