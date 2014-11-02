/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Teo
 */
public class Users {
    private String _name;
    private String _surname;
    private String _phone;
    
    public Users()
    {
        
    }

    public String getName() {
        return _name;
    }

    public String getSurname() {
        return _surname;
    }

    public String getPhone() {
        return _phone;
    }

    public void setName(String name) {
        this._name = name;
    }

    public void setSurname(String surname) {
        this._surname = surname;
    }

    public void setPhone(String phone) {
        this._phone = phone;
    }
}
