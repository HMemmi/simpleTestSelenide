import static com.codeborne.selenide.Selenide.open;
import static org.junit.Assert.*;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class Test {

  @org.junit.Test
  public void test() {
    open("https://github.com/codeborne/selenide/wiki/How-Selenide-creates-WebDriver");
    $(".gh-header-title instapaper_title").shouldNotBe(visible);
    
    
    
  }

}
