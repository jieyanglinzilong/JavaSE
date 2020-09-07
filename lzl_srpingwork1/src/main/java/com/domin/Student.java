package com.domin;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
    private String username;
    private List<String> hobbies;
    private Map<String, String> address;
    private Set<String> aliases;
    private String[] array;

    public Student(String username, List<String> hobbies, Map<String, String> address, Set<String> aliases, String[] array) {
        super();
        this.username = username;
        this.hobbies = hobbies;
        this.address = address;
        this.aliases = aliases;
        this.array = array;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Student() {
        super();
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public void setAddress(Map<String, String> address) {
        this.address = address;
    }

    public void setAliases(Set<String> aliases) {
        this.aliases = aliases;
    }

    public void setArray(String[] array) {
        this.array = array;
    }

    @Override
    public String toString() {
        return "Student{" +
                "username='" + username + '\'' +
                ", hobbies=" + hobbies +
                ", address=" + address +
                ", aliases=" + aliases +
                ", array=" + Arrays.toString(array) +
                '}';
    }
}
