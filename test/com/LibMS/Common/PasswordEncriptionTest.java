/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.LibMS.Common;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author B.M.D.C.Bandara
 */
public class PasswordEncriptionTest {
    
    public PasswordEncriptionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of encrypt method, of class PasswordEncription.
     */
    @Test
    public void testEncrypt() {
        System.out.println("encrypt");
        String message = "Bm199899";
        String expResult = "F3CCKUbfqmrKezpyu/hTLA==";
        String result = PasswordEncription.encrypt(message);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of decrypt method, of class PasswordEncription.
     */
    @Test
    public void testDecrypt() {
        System.out.println("decrypt");
        String message = "fjlxAT4gs02UmREFcC7Xxw==";
        String expResult = "1999";
        String result = PasswordEncription.decrypt(message);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
