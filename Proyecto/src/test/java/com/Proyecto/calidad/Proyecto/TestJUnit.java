package com.Proyecto.calidad.Proyecto;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList; 
 
public class TestJUnit { 
  
	static Coche coche1 = new Coche("Renault ", 4,1000,5);
	static Coche coche2 = new Coche("Ferrari ", 4,2000,2);
	static Coche coche3 = new Coche("Audi ", 4,1500,3); 
	static Coche coche4 = new Coche("Audi ", 3, 500 , 1); 
	static Coche coche5 = null; 
	
	static ArrayList<Coche> coches1 = new ArrayList<Coche>();
	static ArrayList<Coche> coches2 = new ArrayList<Coche>();
	
	@Before
	public void imprimirEntrada(){
		System.out.println("Comenzando prueba");
	}
	
	@BeforeClass	//Antes de todos los test
	public static void rellenarArrays() {
		coches1.add(coche1);
		coches1.add(coche2);
		coches1.add(coche3);
		
		coches2.add(coche4);
		coches2.add(coche5);
	}
	
	@After
	public void imprimirSalida(){
		System.out.println("Fin prueba");
	}
 
	 @AfterClass 			//Después de todos los casos de prueba
	   public static void liberarArrays(){
		   coches1.removeAll(coches1);
		   coches2.removeAll(coches2);
	   }
/*
   @Test 
   public void testNombreCoche() {    		//Comprueba si los objetos son iguales
      assertEquals(coche1.getNombre(),coche2.getNombre()); 		//No tiene éxito
   } 
  */
   @Test 
   public void testPesoCoche() {   			 //Comprueba si la sentencia es true
	   	assertTrue(coche3.estudioPeso()); 						//Tiene éxito
	   } 
   
   @Test 
   public void testPesoCoche2() {    		//Comprueba si la sentencia es false
	   assertFalse(coche4.estudioPeso()); 					//Tiene éxito
	   } 
   /*
   @Test 
   public void testCocheNull() {    		//Comprueba si el objeto NO es null
	   assertNotNull(coche5);  						//NO tiene éxito
	   } */
   
   @Test 
   public void testCocheNull2() {    		//Comprueba si el objeto es null
	   assertNull(coche5);  						//Tiene éxito
	   } 
   /*
    @Test 
   public void testCocheSame() {    		//Comprueba si dos objetos referencian al mismo
	   assertSame(coche1, coche2);  						//NO Tiene éxito
	   } 
   */
   @Test 
   public void testCocheSame2() {    		//Comprueba si dos objetos NO referencian al mismo
	   assertNotSame(coche1, coche3);  						//Tiene éxito
	   } 
   /*
   @Test 
   public void testCocheArray() {    		//Comprueba si dos arrays son lo mismo
	   rellenarArrays();
	   assertArrayEquals(coches1.toArray(), coches2.toArray());  						//NO Tiene éxito
	   } 
   */
  
   
} 
