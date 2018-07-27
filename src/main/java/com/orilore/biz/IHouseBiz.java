package com.orilore.biz;
import com.orilore.model.*;
import java.util.List;

public interface IHouseBiz{
	public boolean save(House house);
	public boolean remove(Integer id);
	public House find(Integer id);
	public List<House> query();
}