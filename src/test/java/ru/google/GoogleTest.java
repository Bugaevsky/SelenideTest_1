package ru.google;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Configuration.startMaximized;
import static com.codeborne.selenide.Configuration.browser;
import static com.codeborne.selenide.Selenide.*;

public class GoogleTest {
    @Test
    public void CheckSomethingTest() {

        browser = "chrome";
        startMaximized = true;

        open("http://vk.com");
        $(By.id("index_email")).setValue("89616418646");
        $(By.id("index_pass")).setValue("stalker12");
        $(By.className("index_login_button")).click();
       /* $$("#ires li.g").shouldHaveSize(10);
        $("#ires li.g").shouldHave(text("selenide"));*/

    }

}
