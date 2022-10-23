package activityCalendary;

import appiumcontrol.Button;
import appiumcontrol.CheckBox;
import appiumcontrol.ComboBox;
import appiumcontrol.TextBox;
import org.openqa.selenium.By;

import java.awt.*;

public class MainScreen {
    public ComboBox mainChange = new ComboBox(By.id("com.agus.bolivia.calendario:id/action_date_opertion"));
    public TextBox toDay = new TextBox(By.xpath("//android.widget.TextView[@resource-id='txttoday']"));
    public TextBox dayCalendary = new TextBox(By.xpath("//android.view.View[@resource-id='desc']"));
    //para hacer el  Assert en la creacion de enventos
    public TextBox newDateSelect = new TextBox(By.xpath("//android.webkit.WebView/android.webkit.WebView/android.view.View[2]"));
    public Button dayBefore= new Button(By.xpath("//android.widget.TextView[@index='41']"));

    public MainScreen(){

   /* public boolean isDisplayed(String title){
        Label note= new Label(By.xpath("//android.widget.TextView[@text='"+title+"']"));
        return  note.isControlDisplayed(); // es para ver si es mostrado o no el dato dinamico "XPath"*/
    }
}
