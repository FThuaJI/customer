package org.fkit.mybatistest.repository;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.fkit.mybatistest.bean.Industry;

import java.util.List;

public interface IndustryRepository {

    @Select("select * from industry")
    public List<Industry> findAllIndustry();

    @Insert("insert into industry (industry_name,industry_code) values (#{industry_name},#{industry_code})")
    public int insertIndustry(Industry industry);

    @Select("select * from industry where industry_id=#{industry_id}")
    public Industry editIndustry(Integer industry_id);

    @Update("update industry set industry_name=#{industry_name},industry_code=#{industry_code} where industry_id=#{industry_id}")
    public int updateIndustry(Industry industry);

    @Delete("delete from industry where industry_id=#{industry_id}")
    public int deleteIndustry(Integer industry_id);
}
