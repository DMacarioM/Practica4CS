package com.Proyecto.calidad.Proyecto;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import static org.junit.Assert.*;

import com.Proyecto.*;

public class TestRunner {

	public void test(String[] args) { 
	       Result result = JUnitCore.runClasses(TestJUnit.class); 
	       for (Failure failure : result.getFailures()) { 
	          System.out.println(failure.toString()); 
	       } 
	       System.out.println(result.wasSuccessful()); 
	    } 

}
