import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ApplicationSubmissionTest {
    @Test
    void mustSendARequest(){
        open("http://localhost:9999");

        $("[name='name']").setValue("Трофимов Никита");
        $("[name='phone']").setValue("+79998988778");
        $("[name='agreement']").click();
        $(".button__content").click();
        $(".alert-success").shouldHave(exactText("Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время."));}
}
