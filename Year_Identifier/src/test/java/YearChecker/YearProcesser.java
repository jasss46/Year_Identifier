package YearChecker;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class YearProcesser {

          public static WebDriver driver;
          public static WebDriverWait wait;
          public static Actions actions;
@Test
    public void reading_Excel() throws IOException, InterruptedException {

        FileInputStream file= new FileInputStream("D:\\Project 1\\Year_Identifier\\src\\test\\java\\SheetFolder\\URLs.xlsx");
        XSSFWorkbook workbook= new XSSFWorkbook(file);
       XSSFSheet sheet= workbook.getSheet("Sheet1");

      int totalRows= sheet.getLastRowNum();
        System.out.println(totalRows);

      int totalCellNumber=  sheet.getRow(1).getLastCellNum();
        System.out.println(totalCellNumber);


            String url = sheet.getRow(1).getCell(0).getStringCellValue();
                System.out.println("URL → " + url);
                 WebDriver driver = new ChromeDriver();
                driver.manage().window().maximize();
                  driver.get(url);
                  Thread.sleep(5000);
    WebElement element1 = driver.findElement(By.xpath("//div[@class=\"fl-module fl-module-heading fl-node-3ba1xrpdwqiy\"]"));
    WebElement element2 = driver.findElement(By.xpath("//div[@class=\"fl-module fl-module-heading fl-node-4no7cbfw5ygi\"]"));

    JavascriptExecutor js = (JavascriptExecutor) driver;

    js.executeScript("arguments[0].scrollIntoView(true);", element1);

    if(element1.getText().contains("2026") && element2.getText().contains("2026")){
        System.out.println("It contains year text: 2025");
    }
    else{
        System.out.println("It does not contain year Text 2025");
    }




}




    }

