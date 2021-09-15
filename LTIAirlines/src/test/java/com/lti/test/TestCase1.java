package com.lti.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.lti.client.Main;
import com.lti.model.Flight;

public class TestCase1 {

	@Test
	public void testAdd() {
		int n1=10,n2=20;
		//assertEquals(20, Main.add(n1, n2));
		assertFalse(Main.compare(n1, n2));
	
	}
	
	@Test
	public void testObjects() {
		Flight f1=new Flight(1000, "Mumbai","Pune");
		Flight f2=new Flight(1000, "Mumbai","Delhi");
		assertSame("Objects are not same",f1,f2);
	}

}
