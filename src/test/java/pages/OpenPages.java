package pages;

import static com.codeborne.selenide.Selenide.open;

public class OpenPages {
    CheckingRegPage check = new CheckingRegPage();
    //для юзабельности стоит использовать scrollTo()
    public void openRegistration(String title) {
        open("/automation-practice-form");
        check.checkHaveText(".practice-form-wrapper", title);
//        $(".practice-form-wrapper").shouldHave(text(title));

    }
}

