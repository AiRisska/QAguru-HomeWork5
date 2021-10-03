package testRegistration;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {
    //создан, чтобы вынести какие-то базовые действия для наших тестов
    //обязательно сделать файл с тестами наследником extends
    @BeforeAll
    static void beforeAll() {

        Configuration.startMaximized = true;
        Configuration.baseUrl = "https://demoqa.com";
    }
}
