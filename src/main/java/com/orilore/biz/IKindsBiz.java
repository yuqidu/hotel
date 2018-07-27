package com.orilore.biz;
import com.orilore.model.*;
import java.util.List;
public interface IKindsBiz{
	public boolean save(Kinds kinds);
	public boolean remove(Integer id);
	public Kinds find(Integer id);
	public List<Kinds> query();
}