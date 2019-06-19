package com.mixone.autoparts.autocar.mapper;

import com.mixone.autoparts.autocar.model.AutoCar;
import com.mixone.autoparts.autocar.model.AutoCarExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface AutoCarMapper {
    long countByExample(AutoCarExample example);

    int deleteByExample(AutoCarExample example);

    int deleteByPrimaryKey(String autocarId);

    int insert(AutoCar record);

    int insertSelective(AutoCar record);

    List<AutoCar> selectByExample(AutoCarExample example);

    AutoCar selectByPrimaryKey(String autocarId);

    int updateByExampleSelective(@Param("record") AutoCar record, @Param("example") AutoCarExample example);

    int updateByExample(@Param("record") AutoCar record, @Param("example") AutoCarExample example);

    int updateByPrimaryKeySelective(AutoCar record);

    int updateByPrimaryKey(AutoCar record);
}