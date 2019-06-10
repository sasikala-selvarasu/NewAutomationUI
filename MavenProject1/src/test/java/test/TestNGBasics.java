package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics{
	
@BeforeSuite
public void beforesuite(){
	System.out.println("This is before suite");
}
@BeforeClass
public void beforeclass(){
	System.out.println("this is before class");
}

@BeforeMethod
public void beforemethod(){
	System.out.println("this is before method");
}
@BeforeTest
public void beforetest(){
	System.out.println("this is before test");
}

@Test
public void testmethod() {
	System.out.println("This is test method");
}
@AfterMethod
public void Aftermethod() {
	System.out.println("This is After method");
}
@AfterClass
public void AfterClass() {
	System.out.println("This is After method");
}
}
