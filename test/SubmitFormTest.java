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
public class SubmitFormTest {
    
 

    /**
     * Test of DataChecksUser method, of class SubmitForm.
     */
    @Test//paei kataxori dedomena kai paei stin forma LoginForm
    public void testDataChecksUser1() {
        
        Users newUser = new Users();
        newUser.setName("Vasilis");
        newUser.setSurname("Vasilis");
        newUser.setPhone("6954123658");
        SubmitForm instance = new SubmitForm();
        instance.DataChecksUser(newUser);
        
    }
    @Test//den dothikan sosta dedomena
    public void testDataChecksUser2() {
        
        Users newUser = new Users();
        newUser.setName("Vasilis");
        newUser.setSurname("Vas#lis");
        newUser.setPhone("6954123658");
        SubmitForm instance = new SubmitForm();
        instance.DataChecksUser(newUser);
        
    }

    
    
}
