package org.fkit.mybatistest.repository;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.fkit.mybatistest.bean.Role;

import java.util.List;

public interface RoleRepository {

    @Select("select * from role")
    public List<Role> findAllRole();

    @Select("select * from role where role_name like concat ('%',#{role_name},'%') " +
            "and role_industry like concat ('%',#{role_industry},'%')")
    public List<Role> findNameAndIndustry(String role_name,String role_industry);

    @Insert("insert into role (role_name,role_code,role_sex,role_industry,role_phone,role_email)"
            + "values (#{role_name},#{role_code},#{role_sex},#{role_industry},#{role_phone},#{role_email})")
    public int insertRole(Role role);

    @Select("select * from role where role_id=#{role_id}")
    public Role editRole(Integer role_id);

    @Update("update role set role_name=#{role_name},role_code=#{role_code},role_sex=#{role_sex}," +
            "role_industry=#{role_industry},role_phone=#{role_phone},role_email=#{role_email} where role_id=#{role_id}")
    public int updateRole(Role role);

    @Delete("delete from role where role_id=#{role_id}")
    public int deleteRole(Integer role_id);
}
