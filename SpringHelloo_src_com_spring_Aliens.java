package com.spring;

public class Aliens {
    private String name;
    private int number;
    private Computer computer;

    public Aliens(String name, int val){

        this.number = val;
    }
//    public Laptop getLap(){
//        return lap;
//    }
    public void setComputer(Computer la){
        this.computer = la;
    }
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setName(String nam){
        this.name = nam;
    }
    public String getName(){
        return this.name;
    }

    public void code(){
        System.out.println("I am coding.. " +getName()+ " " +computer);
    }
}
