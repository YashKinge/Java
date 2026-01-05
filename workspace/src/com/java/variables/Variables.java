package com.java.variables;

public class Variables {
	
    private String address; // instance variable
    
    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void show() {
        String name = "Yash"; // local variable
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {

        Variables v = new Variables();

        v.setAddress("Pune");
        v.show();

        System.out.println("Address: " + v.getAddress());
    }
}
