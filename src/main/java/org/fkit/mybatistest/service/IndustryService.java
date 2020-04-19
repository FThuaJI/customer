package org.fkit.mybatistest.service;

import org.fkit.mybatistest.bean.Industry;
import org.fkit.mybatistest.repository.IndustryRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class IndustryService {

    @Resource
    private IndustryRepository industryRepository;

    public List<Industry> findAllIndustry(){
        return industryRepository.findAllIndustry();
    }

    public int insertIndustry(Industry industry){
        return industryRepository.insertIndustry(industry);
    }

    public Industry editIndustry(Integer industry_id){
        return industryRepository.editIndustry(industry_id);
    }

    public int updateIndustry(Industry industry){
        return industryRepository.updateIndustry(industry);
    }

    public int deleteIndustry(Integer industry_id){
        return industryRepository.deleteIndustry(industry_id);
    }
}
