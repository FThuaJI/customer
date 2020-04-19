package org.fkit.mybatistest.controller;

import org.fkit.mybatistest.bean.Industry;
import org.fkit.mybatistest.service.IndustryService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/industry")
public class IndustryController {

    @Resource
    private IndustryService industryService;

    @RequestMapping("/findAllIndustry")
    public String findAll(Model model){
        List<Industry> industries=industryService.findAllIndustry();
        model.addAttribute("industries",industries);
        return "industry";
    }

    @RequestMapping("/insertIndustry")
    @ResponseBody
    public String insertIndustry(Industry industry){
        int ok=industryService.insertIndustry(industry);
        if (ok>0){
            return "OK";
        }else{
            return "FALL";
        }
    }

    @RequestMapping("/editIndustry")
    @ResponseBody
    public Industry editIndustry(Integer industry_id){
        Industry industry=industryService.editIndustry(industry_id);
        return industry;
    }

    @RequestMapping("/updateIndustry")
    @ResponseBody
    public String updateIndustry(Industry industry){
        int ok=industryService.updateIndustry(industry);
        if (ok>0) {
            return "OK";
        }else {
            return "FALL";
        }
    }

    @RequestMapping("/deleteIndustry")
    @ResponseBody
    public String deleteIndustry(Integer industry_id){
        System.out.println(industry_id);
        int ok=industryService.deleteIndustry(industry_id);
        if (ok>0){
            return "OK";
        }else{
            return "FALL";
        }
    }
}
