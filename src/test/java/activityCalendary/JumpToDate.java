package activityCalendary;

import appiumcontrol.Button;
import appiumcontrol.ComboBox;
import appiumcontrol.TextBox;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;

public class JumpToDate {
   // Display mdisp = getWindowManager().getDefaultDisplay();
    public ComboBox jumpMain = new ComboBox(By.xpath("//android.widget.TextView[@text='saltar a la fecha']"));
    public PointOption pointDayIni = PointOption.point(194,791);
    public PointOption pointDayEnd = PointOption.point(192,791);
    public PointOption pointMonthIni = PointOption.point(347,791);
    public PointOption pointMonthEnd = PointOption.point(200,791);
    public PointOption pointYearIni = PointOption.point(512,791);
    public PointOption pointYearEnd = PointOption.point(400,791);

    public TextBox dayBeforeSearch = new TextBox(By.xpath("//android.widget.NumberPicker[1]/android.widget.EditText"));
    public TextBox monthBeforeSearch = new TextBox(By.xpath("//android.widget.NumberPicker[2]/android.widget.EditText"));
    public TextBox yearforeSearch = new TextBox(By.xpath("//android.widget.NumberPicker[3]/android.widget.EditText"));


    public Button agreeDate= new Button(By.id("android:id/button1"));


}
