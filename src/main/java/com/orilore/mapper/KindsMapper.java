package com.orilore.mapper;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.orilore.model.*;
@Mapper
public interface KindsMapper{
	public boolean insert(Kinds bean);
	public Kinds selectOne(Integer id);
	public boolean delete(Integer id);
	public List<Kinds> select();
	public boolean update(Kinds bean);
}