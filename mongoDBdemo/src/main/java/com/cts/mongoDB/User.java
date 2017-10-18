package com.cts.mongoDB;

/**
 * Created by cts1 on 11/10/17.
 */
public class User {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isEmployee() {
        return isEmployee;
    }

    public void setEmployee(boolean employee) {
        isEmployee = employee;
    }

    public String getRole() {

        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    private String name;


    private String role;
    private boolean isEmployee;

    public Object getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


