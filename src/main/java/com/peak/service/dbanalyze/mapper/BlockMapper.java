package com.peak.service.dbanalyze.mapper;

import com.peak.service.dbanalyze.bean.Block;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BlockMapper {

    @Select("select id block, name dbName from test_table")
    List<Block> list();
}
