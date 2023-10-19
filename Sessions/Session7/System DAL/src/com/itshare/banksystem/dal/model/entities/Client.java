/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itshare.banksystem.dal.model.entities;

/**
 *
 * @author administratorlab
 */
public class Client {

    private int id;
    private String firstname; 
    private String lastname; 
    private int age; 

    public Client(int id, String firstname, String lastname, int age) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.age=age;
    }
    
       public Client( String firstname, String lastname, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age=age;
    }

       
       public Client( ) {
       
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Client{" + "id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", age=" + age + '}'+"\n";
    }
    
    
    
    

}
