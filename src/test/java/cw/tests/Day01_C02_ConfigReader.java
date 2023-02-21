package cw.tests;

import cw.utilities.ConfigReader;
import cw.utilities.Driver;
import org.testng.annotations.Test;
public class Day01_C02_ConfigReader {
    @Test
    public void configReader() {
        Driver.getDriver().get(ConfigReader.getProperty("google_url"));
        Driver.closeDriver();
    }
}
