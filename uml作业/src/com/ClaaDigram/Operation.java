package com.ClaaDigram;

import java.util.List;

public interface Operation {
    Account inTranfer(Account account);
    Account outTranfer(Account account);
    List<Teacher> findByTeacher(String id);
    Teacher findByOneself(String id);
    Student findByStudent(String id);
    Administrator findadministrator();
    void blockCard(String id);
    void unlockCard(String id);
    boolean BOOLEAN();
    String findPassword(User user);
    void changePaaword(String id,String password);


}
