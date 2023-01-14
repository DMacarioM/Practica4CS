package com.Proyecto.calidad.Proyecto;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

public class TestAssertions {

	@Test
	public void testAssertions() {
		//Test data
		Coche coche1 = new Coche("Renault ", 4,1000,5);
		Coche coche2 = new Coche("Ferrari ", 4,2000,2);
		Coche coche3 = new Coche("Audi ", 4,1500,3); 
		Coche coche4 = new Coche("Audi ", 3, 500 , 1); 
		Coche coche5 = null; 
		
		ArrayList<Coche> coches1 = new ArrayList<Coche>();
		ArrayList<Coche> coches2 = new ArrayList<Coche>();
		coches1.add(coche1);
		coches1.add(coche2);
		coches1.add(coche3);
		
		coches2.add(coche4);
		coches2.add(coche5);
		
		 //Comprueba si los objetos son iguales
	      assertEquals(coche1.getNombre(),coche2.getNombre()); 
	      
	     //Comprueba si la sentencia es true
		   	assertTrue(coche3.estudioPeso());
		   	
		 //Comprueba si la sentencia es false
			   assertFalse(coche4.estudioPeso());
			   
		 //Comprueba si el objeto NO es null
			   assertNotNull(coche5);  
			   
		 //Comprueba si el objeto es null
			   assertNull(coche5);
		  
	     //Comprueba si dos objetos referencian al mismo
			   assertSame(coche1, coche2);  
			   
		 //Comprueba si dos objetos NO referencian al mismo
			   assertSame(coche1, coche3);  
		
		 //Comprueba si dos arrays son lo mismo
			   assertArrayEquals(coches1.toArray(), coches2.toArray());
	}
}
