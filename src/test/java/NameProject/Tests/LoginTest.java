package NameProject.Tests;

import NameProject.StartClass;
import NameProject.Pages.LoginPage;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


//это сам класс в папке Tests - тут мы пишем ТЕСТЫ.
//тут мы пишем тесты именно на страничку ЛОГИНА. захотим писать на другую страницу - значит нада создать два новых класса - одну пейджу
// и один тест класс в папке тест. короче все как с логином сейчас

public class LoginTest extends StartClass{

    @Test //login to the rozetka
    public void validLogin(){ //название метода
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class); //это мы инициализируем страничку, где наши методы и локаторы
        //т.е. твоя программа не может просто так дернуть методы из любого класса.
        // тебе ей нада сказать, эй идея, посмотри, вот тут находятся локаторы и методы, которые мы хотим вызвать!
        //LoginPage loginPage - это названия страницы которую мы инициализируем. сначала с большой буквы потом с маленькой. такое правило
        // = PageFactory.initElements(driver, LoginPage.class); - это мы используем пейдж фактори, почитаешь что это такое.
        //и в скобки вставляем драйвер - говорим драйвер, применись!



        //а это мы дергаем наш метод из странички loginPage - мы говорим ИДЕЯ, иди на страничку loginPage и дерни метод signInBrnClick()
        loginPage.signInBrnClick();

        //вот так это работает

        //теперь дергаем следующий уже написанный только что метод
        loginPage.setLogin();
    }

}
