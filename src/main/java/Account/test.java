/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Account;

import java.text.DecimalFormat;

/**
 *
 * @author ADMIN
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Account ac1,ac2;
       
       DecimalFormat fmt =new DecimalFormat("#,##0");
       //tao doi tuuong acc1: thong tin chinh minh
       ac1=new Account ("AC001","Trinh g h",900000000);
       //tao dôi tuong acc2: thong tin nguoi khac
       ac2= new Account ("Ac002","huhaha",400000000);
       System.out.print("---THONG TIN TAI KHAON BAN DAU---");
       System.out.println("My Account: id: "+ac1.getid()+"- name: "+ac1.getname()+"-"+ac1.getBalance()); 
       System.out.println("Other Account: id: "+ac2.getid()+"- name: "+ac2.getname()+"-"+ac2.getBalance()); 
       
       ac1.debit(100000);
       ac2.debit(500000);
       
        System.out.print("---THONG TIN TAI KHOAN SAU KHI GIAO DICH---");
       System.out.println("My Account: id: "+ac1.getid()+"- name: "+ac1.getname()+"-"+ac1.getBalance()); 
       System.out.println("Other Account: id: "+ac2.getid()+"- name: "+ac2.getname()+"-"+ac2.getBalance()); 
    }
    
}
