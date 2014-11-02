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
public class LoginFormTest {
    
/**
     * Test of DataChecksUserLogin method, of class LoginForm.
     */
    @Test//kani login
    public void testDataChecksUserLogin1() {
        Users newUser = new Users();        
        newUser.setSurname("Vasilis");
        newUser.setPhone("6954123658");
        LoginForm instance = new LoginForm();
        instance.DataChecksUserLogin(newUser);
        
    }

    @Test//den dothikan sosta dedomena
    public void testDataChecksUserLogin2() {
        Users newUser = new Users();        
        newUser.setSurname("Vasilis");
        newUser.setPhone("69541523658");
        LoginForm instance = new LoginForm();
        instance.DataChecksUserLogin(newUser);
        
    }
    
}
