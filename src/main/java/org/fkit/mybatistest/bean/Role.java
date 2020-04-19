package org.fkit.mybatistest.bean;

import java.io.Serializable;

public class Role implements Serializable {

    private Integer role_id;
    private String role_name;
    private String role_code;
    private int role_sex;
    private String role_industry;
    private String role_phone;
    private String role_email;

    public Role() {
    }

    public Role(Integer role_id, String role_name, String role_code, int role_sex, String role_industry, String role_phone, String role_email) {
        this.role_id = role_id;
        this.role_name = role_name;
        this.role_code = role_code;
        this.role_sex = role_sex;
        this.role_industry = role_industry;
        this.role_phone = role_phone;
        this.role_email = role_email;
    }

    public Integer getRole_id() {
        return role_id;
    }

    public void setRole_id(Integer role_id) {
        this.role_id = role_id;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

    public String getRole_code() {
        return role_code;
    }

    public void setRole_code(String role_code) {
        this.role_code = role_code;
    }

    public int getRole_sex() {
        return role_sex;
    }

    public void setRole_sex(int role_sex) {
        this.role_sex = role_sex;
    }

    public String getRole_industry() {
        return role_industry;
    }

    public void setRole_industry(String role_industry) {
        this.role_industry = role_industry;
    }

    public String getRole_phone() {
        return role_phone;
    }

    public void setRole_phone(String role_phone) {
        this.role_phone = role_phone;
    }

    public String getRole_email() {
        return role_email;
    }

    public void setRole_email(String role_email) {
        this.role_email = role_email;
    }
}
