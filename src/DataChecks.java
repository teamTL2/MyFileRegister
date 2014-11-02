/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author STRATOS
 */
public class DataChecks {
    
    
    public boolean SubmitDataChecks(Users newUser){
        boolean NameResult = ChCheck(newUser.getName()); 
        boolean SurnameResult = ChCheck(newUser.getSurname()); 
        boolean PhoneResult = Phone(newUser.getPhone()); 
        
        if((NameResult && SurnameResult && PhoneResult)!= true)
            return false;
        
        return true;
    }
    
    public boolean LoginDataChecks(Users newUser){
        boolean SurnameResult = ChCheck(newUser.getSurname()); 
        boolean PhoneResult = Phone(newUser.getPhone()); 
        
        if((SurnameResult && PhoneResult)!= true)
            return false;
        
        return true;
    }
    
    public boolean ChCheck(String ch)
    {
        String[] RestrictedSymbols = {"!","@","#","$","%","^","&","*","(",")","-","_","+","*","/"};
        
        if(ch.isEmpty())
            return false;
        for(int i=0; i<=9; i++){
            if(ch.contains(i+""))
                return false;
        }
        for(int i=0; i<RestrictedSymbols.length; i++){
            if(ch.contains(RestrictedSymbols[i]))
                return false;
        }
        if(ch.contains(" "))
            return false;
        
        return true;
    }
    
    public boolean Phone(String phone)
    {
        if(!phone.matches("[-+]?\\d*\\.?\\d+"))
                return false;
        if(phone.contains(" "))
            return false;
        if(phone.isEmpty())
            return false;
        if(phone.length()!=10)
            return false;
        if(phone.substring(0,2).equals("69")!=true)
            return false;
        
        return true;
    }
}
