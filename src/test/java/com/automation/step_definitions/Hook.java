package com.automation.step_definitions;

import com.automation.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.util.concurrent.TimeUnit;

public class Hook {

    @Before
    public void setUp(){
        Driver.get().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @After
    public void teardown() {
       // Driver.closeDriver();
    }
}
