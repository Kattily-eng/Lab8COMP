package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static androidx.test.espresso.Espresso.onData;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static
androidx.test.espresso.assertion.ViewAssertions.doesNotExist;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.CoreMatchers.anything;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import androidx.test.core.app.ActivityScenario;
import androidx.test.espresso.action.ViewActions;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;import java.util.ArrayList;

public class CustomListTest {
@Rule
public ActivityScenarioRule<MainActivity> scenario = new
ActivityScenarioRule<MainActivity>(MainActivity.class);    
  @Test
    public void TesthasCities(){
      City A=new City("Ed","AB");
      cityDataList.add( A);  
      assertTrue(CustomList.hascity(A));      
    }
  
  public void TestdeleteCities(){
      City A=new City("Ed","AB");
      cityDataList.add(A);  
      CityDataList.delete(A)
      assertFalse(CustomList.hascity(A));   
    }
  public void TestcountCities(){
     assertEquals(6,CustomList.getCount());  
    City A=new City("Edmonton","AB");
      cityDataList.add(A);  
      
      assertEquals(7,CustomList.getCount());   
    }  
}
