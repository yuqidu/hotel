package com.orilore.mapper;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.orilore.model.*;
@Mapper
public interface HouseMapper{
	public boolean insert(House bean);
	public House selectOne(Integer id);
	public boolean delete(Integer id);
	public List<House> select();
	public boolean update(House bean);
}