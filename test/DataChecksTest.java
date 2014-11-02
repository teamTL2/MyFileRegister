/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ancelotti
 */
public class DataChecksTest {
/**
     * Test of DataChecks method, of class SubmitDataChecks.
     */
    @Test
    public void SubmitDataChecks1() {
        Users newUser = new Users();
        newUser.setName("Vasilis");
        newUser.setSurname("Vasilis");
        newUser.setPhone("6954123658");
        DataChecks instance = new DataChecks();
        boolean expResult = true;
        boolean result = instance.SubmitDataChecks(newUser);
        assertEquals(expResult, result);
    }
    @Test
    public void SubmitDataChecks2() {
        Users newUser = new Users();
        newUser.setName("Vasi56lis");
        newUser.setSurname("Vasilis");
        newUser.setPhone("6954123658");
        DataChecks instance = new DataChecks();
        boolean expResult = false;
        boolean result = instance.SubmitDataChecks(newUser);
        assertEquals(expResult, result);
    }
    @Test
    public void SubmitDataChecks3() {
        Users newUser = new Users();
        newUser.setName("Vasilis");
        newUser.setSurname("Va#$silis");
        newUser.setPhone("6954123658");
        DataChecks instance = new DataChecks();
        boolean expResult = false;
        boolean result = instance.SubmitDataChecks(newUser);
        assertEquals(expResult, result);
    }
    @Test
    public void SubmitDataChecks4() {
        Users newUser = new Users();
        newUser.setName("Vasilis");
        newUser.setSurname("Vasilis");
        newUser.setPhone("69541236658");
        DataChecks instance = new DataChecks();
        boolean expResult = false;
        boolean result = instance.SubmitDataChecks(newUser);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of DataChecks method, of class LoginDataChecks.
     */
    @Test
    public void LoginDataChecks1() {
        Users newUser = new Users();        
        newUser.setSurname("Vasilis");
        newUser.setPhone("6954123658");
        DataChecks instance = new DataChecks();
        boolean expResult = true;
        boolean result = instance.LoginDataChecks(newUser);
        assertEquals(expResult, result);
    }
    @Test
    public void LoginDataChecks2() {
        Users newUser = new Users();
        newUser.setSurname("Vas34ilis");
        newUser.setPhone("6954123658");
        DataChecks instance = new DataChecks();
        boolean expResult = false;
        boolean result = instance.LoginDataChecks(newUser);
        assertEquals(expResult, result);        
    }
    @Test
    public void LoginDataChecks3() {
        Users newUser = new Users();
        newUser.setSurname("Vasilis");
        newUser.setPhone("695412363658");
        DataChecks instance = new DataChecks();
        boolean expResult = false;
        boolean result = instance.LoginDataChecks(newUser);
        assertEquals(expResult, result);        
    }

    /**
     * Test of ChCheck method, of class DataChecks.
     */
    @Test
    public void testChCheck1() {
        String ch = "Vasilis";
        DataChecks instance = new DataChecks();
        boolean expResult = true;
        boolean result = instance.ChCheck(ch);
        assertEquals(expResult, result);
    }
    @Test
    public void testChCheck2() {
        String ch = "8anasis";
        DataChecks instance = new DataChecks();
        boolean expResult = false;
        boolean result = instance.ChCheck(ch);
        assertEquals(expResult, result);
    }
    @Test
    public void testChCheck3() {
        String ch = " ";
        DataChecks instance = new DataChecks();
        boolean expResult = false;
        boolean result = instance.ChCheck(ch);
        assertEquals(expResult, result);
    }
    @Test
    public void testChCheck4() {
        String ch = "";
        DataChecks instance = new DataChecks();
        boolean expResult = false;
        boolean result = instance.ChCheck(ch);
        assertEquals(expResult, result);
    }
    @Test
    public void testChCheck5() {
        String ch = "petros@#$*";
        DataChecks instance = new DataChecks();
        boolean expResult = false;
        boolean result = instance.ChCheck(ch);
        assertEquals(expResult, result);
    }

    /**
     * Test of Phone method, of class DataChecks.
     */
    @Test
    public void testPhone1() {
        String phone = "6934567890";
        DataChecks instance = new DataChecks();
        boolean expResult = true;
        boolean result = instance.Phone(phone);
        assertEquals(expResult, result);
    }
    @Test
    public void testPhone2() {
        String phone = "693456789";
        DataChecks instance = new DataChecks();
        boolean expResult = false;
        boolean result = instance.Phone(phone);
        assertEquals(expResult, result);
    }
    @Test
    public void testPhone3() {
        String phone = "69234567890";
        DataChecks instance = new DataChecks();
        boolean expResult = false;
        boolean result = instance.Phone(phone);
        assertEquals(expResult, result);
    }
    @Test
    public void testPhone4() {
        String phone = "69345sxdfcgv6789";
        DataChecks instance = new DataChecks();
        boolean expResult = false;
        boolean result = instance.Phone(phone);
        assertEquals(expResult, result);
    }
    @Test
    public void testPhone5() {
        String phone = "69345.454";
        DataChecks instance = new DataChecks();
        boolean expResult = false;
        boolean result = instance.Phone(phone);
        assertEquals(expResult, result);
    }
    @Test
    public void testPhone6() {
        String phone = "693  4567 89";
        DataChecks instance = new DataChecks();
        boolean expResult = false;
        boolean result = instance.Phone(phone);
        assertEquals(expResult, result);
    }
    @Test
    public void testPhone7() {
        String phone = "";
        DataChecks instance = new DataChecks();
        boolean expResult = false;
        boolean result = instance.Phone(phone);
        assertEquals(expResult, result);
    }
    
}
