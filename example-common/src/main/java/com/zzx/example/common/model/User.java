package com.zzx.example.common.model;


import java.io.Serializable;

/**
 * @Auther: zzx
 * @Date: 2024/11/16 - 11 - 16 - 16:38
 * @Description: com.zzx.example.common.model
 * @version: 1.0
 * 用户
 */
public class User implements Serializable {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
