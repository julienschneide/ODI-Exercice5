// Auteur : Julien Schneider
// Version : 1.1

package ch.hearc.ig.odi.customeraccount.App;

import ch.hearc.ig.odi.customeraccount.business.Account;
import ch.hearc.ig.odi.customeraccount.business.Bank;
import ch.hearc.ig.odi.customeraccount.business.Customer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author silvio.gutierre
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Bank bank = new Bank(0,"HEG BANK");
        
        bank.addCustomer(0,"Silvio","Gutierrez");
        bank.addCustomer(1,"Ajtene","Kurtaliqi");
        
        bank.addAccount("0","Compte Epargne",0.21,bank.getCustomerByNumber(0));
        bank.addAccount("1","Compte Courant",0.4,bank.getCustomerByNumber(1));
        bank.addAccount("2","Compte Epargne",0.05,bank.getCustomerByNumber(1));
        
        bank.getAccountByNumber("0").credit(1000);
        bank.getAccountByNumber("1").credit(230);
        bank.getAccountByNumber("2").credit(5000);
        
        System.out.println("compte 1: ");
        System.out.println(bank.getAccountByNumber("0").getBalance());
        System.out.println("compte 2: ");
        System.out.println(bank.getAccountByNumber("1").getBalance());
        System.out.println("compte 3: ");
        System.out.println(bank.getAccountByNumber("2").getBalance());
        
        bank.getAccountByNumber("0").credit(500);
        Account.transfer(230,bank.getAccountByNumber("2"),bank.getAccountByNumber("1"));
        
        System.out.println("compte 1: ");
        System.out.println(bank.getAccountByNumber("0").getBalance());
        System.out.println("compte 2: ");
        System.out.println(bank.getAccountByNumber("1").getBalance());
        System.out.println("compte 3: ");
        System.out.println(bank.getAccountByNumber("2").getBalance());

        
    }
    
}
