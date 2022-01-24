/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenjunit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author dho19
 */
public class MavenDavidTest {
    
    public MavenDavidTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    
  

    /**
     * Test of dia_laboral method, of class MavenDavid.
     */
   
    @Test
    public void testDia_laboral() {
        System.out.println("dia_laboral");
        String dia = "Lunes";
        boolean expResult = true;
        boolean result = MavenDavid.dia_laboral(dia);
        assertEquals(expResult, result);
      
    }
    /* Introducimos para que verifique el valor Martes por true*/
    @Test
     public void testDia_laboral2() {
        System.out.println("dia_laboral");
        String dia = "Martes";
        boolean expResult = true;
        boolean result = MavenDavid.dia_laboral(dia);
        assertEquals(expResult, result);
      
    }
     /* Introducimos para que verifique el valor Miercoles por true*/
    @Test
     public void testDia_laboral3() {
        System.out.println("dia_laboral");
        String dia = "Miercoles";
        boolean expResult = true;
        boolean result = MavenDavid.dia_laboral(dia);
        assertEquals(expResult, result);
      
    }
     /* Introducimos para que verifique el valor Jueves por true*/
       @Test
      public void testDia_laboral4() {
        System.out.println("dia_laboral");
        String dia = "Jueves";
        boolean expResult = true;
        boolean result = MavenDavid.dia_laboral(dia);
        assertEquals(expResult, result);
      
    }
      /* Introducimos para que verifique el valor Viernes por true*/
        @Test
      public void testDia_laboral5() {
        System.out.println("dia_laboral");
        String dia = "Viernes";
        boolean expResult = true;
        boolean result = MavenDavid.dia_laboral(dia);
        assertEquals(expResult, result);
      
    }
       /* Introducimos para que verifique el valor Sabado por false*/
       @Test
       public void testDia_laboral6() {
        System.out.println("dia_laboral");
        String dia = "Sabado";
        boolean expResult = false;
        boolean result = MavenDavid.dia_laboral(dia);
        assertEquals(expResult, result);
      
    }
        /* Introducimos para que verifique el valor Domingo por false*/
       @Test
       public void testDia_laboral7() {
        System.out.println("dia_laboral");
        String dia = "Domingo";
        boolean expResult = false;
        boolean result = MavenDavid.dia_laboral(dia);
        assertEquals(expResult, result);
      
    }
       /* Introducimos para que verifique el valor por Default*/
        @Test
       public void testDia_laboraldefault() {
        System.out.println("dia_laboral");
        String dia = "";
        boolean expResult = false;
        boolean result = MavenDavid.dia_laboral(dia);
        assertEquals(expResult, result);
      
    }
    
}
