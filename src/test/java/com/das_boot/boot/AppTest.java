package com.das_boot.boot;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.web.bind.annotation.RestController;

import com.boot.controller.HomeController;

@RestController
public class AppTest 
{
	@Test
    public void testApp()
    {
        HomeController hc= new HomeController();
        String result = hc.home();
        assertEquals(result,  "Das boot, reporting for duty");
    }
}
