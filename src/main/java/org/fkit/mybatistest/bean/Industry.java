package org.fkit.mybatistest.bean;

import java.io.Serializable;

public class Industry implements Serializable {

    private Integer industry_id;
    private String industry_name;
    private String industry_code;


    public Industry(Integer industry_id, String industry_name, String industry_code) {
        this.industry_id = industry_id;
        this.industry_name = industry_name;
        this.industry_code = industry_code;
    }

    public Industry() {
    }

    public Integer getIndustry_id() {
        return industry_id;
    }

    public void setIndustry_id(Integer industry_id) {
        this.industry_id = industry_id;
    }

    public String getIndustry_name() {
        return industry_name;
    }

    public void setIndustry_name(String industry_name) {
        this.industry_name = industry_name;
    }

    public String getIndustry_code() {
        return industry_code;
    }

    public void setIndustry_code(String industry_code) {
        this.industry_code = industry_code;
    }
}
