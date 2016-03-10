/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ch.hearc.ig.odi.customeraccount.business;

import java.util.Date;

/**
 *
 * @author Julien Schneider <julien.schneider@he-arc.ch>
 */
public class Individual extends Customer{
    
    private Date birthDate;
    private String email;

    public Individual(int number, String firstName, String lastName) {
        super(number, firstName, lastName);
    }

    public Individual(Date birthDate, String email, int number, String firstName, String lastName) {
        super(number, firstName, lastName);
        this.birthDate = birthDate;
        this.email = email;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }      
}
