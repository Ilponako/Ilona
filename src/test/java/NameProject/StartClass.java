package NameProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class StartClass {
    public static WebDriver driver = null;


    // это стартовый класс твой, он запускает браузер и открывает сайт - это понятно это мы уже делали- просто вынесли его в отдельный файл

    @BeforeSuite
    public void preClass() {
        System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Ilona\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rozetka.com.ua/");
    }
    @AfterSuite
     public void teardownTest () {
        driver.close();
    }



    // вот сюда пропиши еще @AfterClass как на скрине
    //чтобы оно закрывало твой браузер после каждого теста.
    // афтер метод или афтер класс - попробуешь короче.
}

