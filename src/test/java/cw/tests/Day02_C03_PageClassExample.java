package cw.tests;

import cw.pages.HtmlGoodiesHomePage;
import cw.utilities.Driver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
public class Day02_C03_PageClassExample {
    @Test
    public void test(){
        Driver.getDriver().get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        HtmlGoodiesHomePage hp = new HtmlGoodiesHomePage();
        Actions actions = new Actions(Driver.getDriver());

        actions.dragAndDrop(hp.copenhag, hp.denmark)
                .dragAndDrop(hp.seoul, hp.sKorea)
                .dragAndDrop(hp.madrid, hp.spain)
                .dragAndDrop(hp.rome, hp.italy)
                .dragAndDrop(hp.washington, hp.us)
                .dragAndDrop(hp.oslo, hp.norway)
                .dragAndDrop(hp.stockholm, hp.sweden).perform();
    }
}
