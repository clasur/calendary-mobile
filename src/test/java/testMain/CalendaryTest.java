package testMain;

import activityCalendary.*;
import appiumcontrol.Label;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.apache.tools.ant.taskdefs.Touch;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.springframework.util.Assert;
import singleton.Session;

//import static jdk.internal.jshell.debug.InternalDebugControl.release;

public class CalendaryTest {
    MainScreen mainScreen= new MainScreen();
    SelectDayIconNoteSave selectDayIconNoteSave = new SelectDayIconNoteSave();
    JumpToDate jumpToDate = new JumpToDate();

    String texto = "Last payament to the bank";


    // Saltar a una fecha requerida por el usuario
    @Test
    public void jumpDateRequest(){
        mainScreen.mainChange.click();
        jumpToDate.jumpMain.click();
       // jumpToDate.dragg.findControl();
        //WebElement webElementDragg =jumpToDate.dragg.getControl();
        //jumpToDate.dropp.findControl();
        //WebElement webElementDropp =jumpToDate.dropp.getControl();
        TouchAction actionDraggDay = new TouchAction(Session.getInstance().getDriver());
        actionDraggDay.press(jumpToDate.pointDayIni).perform();
        TouchAction actionDroppDay = new TouchAction(Session.getInstance().getDriver());
        actionDroppDay.press(jumpToDate.pointDayIni).moveTo(jumpToDate.pointDayEnd).release().perform();

        TouchAction actionDraggMonth = new TouchAction(Session.getInstance().getDriver());
        actionDraggMonth.press(jumpToDate.pointMonthIni).perform();
        TouchAction actionDroppMonth = new TouchAction(Session.getInstance().getDriver());
        actionDroppMonth.press(jumpToDate.pointMonthIni).moveTo(jumpToDate.pointMonthEnd).release().perform();

        TouchAction actionDraggYear = new TouchAction(Session.getInstance().getDriver());
        actionDraggYear.press(jumpToDate.pointYearIni).perform();
        TouchAction actionDroppYear = new TouchAction(Session.getInstance().getDriver());
        actionDroppYear.press(jumpToDate.pointYearIni).moveTo(jumpToDate.pointYearEnd).release().perform();

        String actualDay = jumpToDate.dayBeforeSearch.getText();
        String actualMonth = jumpToDate.monthBeforeSearch.getText();
        String actualYear = jumpToDate.yearforeSearch.getText();

        jumpToDate.agreeDate.click();

        Label label = null;
        boolean startmatch = false;
        for(int i=10 ; i<=51 ; i=i+1){
            label = new Label(By.xpath("//android.webkit.WebView/android.webkit.WebView/android.view.View/android.widget.TextView["+i+"]"));
            if(label.getText().equals("1")) startmatch = true;
            if(label.getText().equals(actualDay) && startmatch){
                break;
            }
        }
        if(label != null) label.click();
        else System.out.println("Label is null");

        selectDayIconNoteSave.newNoteEvent.setText(texto);
        selectDayIconNoteSave.addIconEventNew.click();
        selectDayIconNoteSave.imaIconSelect.click();
        selectDayIconNoteSave.saveNewEvent.click();


        Assert.notNull(actualDay,"Day not is Select");
        Assert.notNull(actualMonth,"Month not is Select");
        Assert.notNull(actualYear,"Year not is Select");

    }


 //@AfterEach

}
