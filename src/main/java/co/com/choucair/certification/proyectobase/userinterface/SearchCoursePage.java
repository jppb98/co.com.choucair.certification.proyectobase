package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {

    public static final Target BUTTON_UC = Target.the("Select Choucair University")
            .located(By.xpath("//div[@id='universidad']//strong"));

    public static final Target INPUT_COURSE = Target.the("Search the course").located(By.id("courseseacrhbox"));

    public static final Target BUTTON_GO = Target.the("Click to find the course")
            .located(By.xpath("//button[@class='btn btn-secondary']"));

    public static final Target SELECT_COURSE = Target.the("Click to select the course")
            .located(By.xpath("//h4[@contains(text(),'Recursos Automatización Colombia')]"));

    public static final Target NAME_COURSE = Target.the("extract the name of the course")
            .located(By.xpath("//h1[contains(text(),'Recursos Automatización Colombia')]"));

}
