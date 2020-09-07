package com.impl;

import com.dao.services;
import com.dao.user;

public class servicesimpl implements services {
    user userdao;

    public void setUserdao(user userdao) {
        this.userdao = userdao;
    }

    public void say() {
        this.userdao.say();
        System.out.println("服务启动成功");
    }
}
