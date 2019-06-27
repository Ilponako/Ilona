package NameProject.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


//это страничка твоего логина. здесь описывается локаторы элементов и методы
// каждый клик на кнопку или попытка ввести текст в поле - это отдельный метод

public class LoginPage {
    WebDriver driver;  // это мы говорим драйверу , что он есть
    public LoginPage(WebDriver driver){
        this.driver=driver;
    } //вот то что в скобка с драйвером это мы его сюда зовем в этот класс. так делать во всех новых классах в папке Pages.
    // Просто копируешь и все


    //это наш локатор - кнопка sign in. ищем по икспасу. все тоже как мы искали просто записываем в новом виде
    @FindBy(xpath = "//a[@class=\"header-topline__user-link link-dashed\"]")
    private WebElement signInBtn;
    @FindBy (id ="\"auth_email\"");  //- сюда икспас чи айди погугли как с айдишником
    private WebElement loginField; //- тут меняешь название переменной


    public void signInBrnClick() {
        signInBtn.click();
    }

    public void setLogin() {
        loginField.sendKeys("popichko@ukr.net");
    }
}


//это наш метод нажатия на кнопку
//нижэе нужно написать сам метод введения текста в поле (введения логина, введение пароля)
//для начала пишешь локатор поля логи и поля пароля вверх отсюда к локатором
// а ниже тут под этим методом пишешь метод нажатия и введения текста в поля
// то есть + 2 метода должна написать ниже и + 2 локатора выше )))