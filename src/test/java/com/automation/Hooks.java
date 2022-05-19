package com.automation;

import com.automation.propertyreader.PropertyReader;
import com.automation.utility.Utility;
import com.cucumber.listener.Reporter;


import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;


import java.io.IOException;


public class Hooks extends Utility {

    //select before-cucumber.api.java
    @Before
    public void setUp(){
        selectBrowser(PropertyReader.getInstance().getProperty("browser"));
    }
    //after= from cucumber.api.java
    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            String screenShotPath = Utility.getScreenshot(driver, scenario.getName().replace(" ", "_"));
            try {
                Reporter.addScreenCaptureFromPath(screenShotPath);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        closeBrowser();
    }
}
