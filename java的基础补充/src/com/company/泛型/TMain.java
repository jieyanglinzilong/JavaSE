package com.company.泛型;

public class TMain<T> {
     T ob;
    public TMain( T o) {
        ob=o;
    }
    T getOb(){
        return ob;
    }
}
