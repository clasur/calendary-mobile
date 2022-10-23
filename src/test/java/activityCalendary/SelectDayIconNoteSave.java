package activityCalendary;

import appiumcontrol.Button;
import appiumcontrol.TextBox;
import org.apache.commons.collections.BagUtils;
import org.openqa.selenium.By;

public class SelectDayIconNoteSave {


    public Button addIconEventNew= new Button(By.id("com.agus.bolivia.calendario:id/imageButtonIcon"));
    public Button imaIconSelect= new Button(By.xpath("//androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[10]/android.widget.ImageView"));
    public TextBox newNoteEvent= new TextBox(By.id("com.agus.bolivia.calendario:id/editTextTitle"));
    public Button saveNewEvent= new Button(By.id("com.agus.bolivia.calendario:id/buttonSaveEvent"));


}
