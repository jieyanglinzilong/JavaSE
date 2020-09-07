package com.company.泛型;

public class Mn {
    public static void main(String args[]){

        people people=new people();
        people.setId(12);
        people.setName("周薰");
        TMain m=new TMain(people);
        System.out.println(m.getOb());
    }
}
