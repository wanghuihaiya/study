package com.wsmsz.study.system.mune.mapper;

import com.wsmsz.study.system.mune.bean.Mune;

public interface MuneMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Mune record);

    int insertSelective(Mune record);

    Mune selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Mune record);

    int updateByPrimaryKey(Mune record);
}