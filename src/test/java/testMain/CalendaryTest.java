package testMain;

import activityCalendary.*;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.apache.tools.ant.taskdefs.Touch;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import org.springframework.util.Assert;
import singleton.Session;

//import static jdk.internal.jshell.debug.InternalDebugControl.release;

public class CalendaryTest {
    MainScreen mainScreen= new MainScreen();
    DeleteSelect deleteSelect = new DeleteSelect();
    GoToDay goToDay = new GoToDay();
    SelectDayIconNoteSave selectDayIconNoteSave = new SelectDayIconNoteSave();
    JumpToDate jumpToDate = new JumpToDate();

    String texto = "Last payament to the bank";


    // Segundo Test , Saltar a una fecha requerida por el usuario
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

        jumpToDate.agreeDate.click();

        String newYear=jumpToDate.pointYearIni.toString();
        System.out.println("here has got it"+ newYear);

        

        //Assert.isNull();
    }

    // Tercer Test , Crear un evento en una fecha determinada alguna actividad requerida,creando icono, nota
    @Test
    public void createEventDate(){
        mainScreen.dayBefore.click();
        selectDayIconNoteSave.addIconEventNew.click();
        selectDayIconNoteSave.imaIconSelect.click();
        selectDayIconNoteSave.newNoteEvent.setText(texto);
        selectDayIconNoteSave.saveNewEvent.click();

    }
    // Cuarto Test , Eliminar el evento creado en una fecha determinada
    @Test
    public void deleteEventDate(){
        mainScreen.dayBefore.click();
        deleteSelect.deleteEventSelect.click();


    }

    //@AfterEach

}
