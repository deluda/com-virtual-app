/*
 * Brief: This is a sample of using JUnit unit testing framework
 * Author: Chris Forehand
 * Date Started: 3/2014
 * Test Cases: 
 * Major Modifications: None
 * */

package com.vcclass.app;

import static org.junit.Assert.*;

import java.util.Locale;

import org.junit.Test;
import org.springframework.ui.ExtendedModelMap;

import com.vcclass.app.Controllers.HomeController;

public class HomeControllerTests {
	
	@Test
	public void HandleRequestViewTest()
	{
		HomeController controller = new HomeController();
		Locale locale = new Locale("en-us"); 
		
        String result = controller.home(locale, new ExtendedModelMap());
        String expected = "home"; 
        assertEquals(result, expected);
	}

}
