package com.mixone.portal.admin.org.service;

import com.mixone.portal.admin.org.model.Person;
import com.mixone.portal.admin.org.model.PersonExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PersonService {
    long countByExample(PersonExample example);

    int deleteByExample(PersonExample example);

    int deleteByPrimaryKey(String personId);

    int insert(Person record);

    int insertSelective(Person record);

    List<Person> selectByExample(PersonExample example);

    Person selectByPrimaryKey(String personId);

    int updateByExampleSelective(@Param("record") Person record, @Param("example") PersonExample example);

    int updateByExample(@Param("record") Person record, @Param("example") PersonExample example);

    int updateByPrimaryKeySelective(Person record);

    int updateByPrimaryKey(Person record);
}
