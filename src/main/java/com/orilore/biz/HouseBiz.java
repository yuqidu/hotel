package com.orilore.biz;
import com.orilore.model.*;
import com.orilore.mapper.*;
import java.util.*;

import org.springframework.stereotype.Service;
@Service
public class HouseBiz implements IHouseBiz{

	private HouseMapper mapper  = null;

	@Override
	public boolean save(House bean) {
		if(bean.getId()!=null){
			return this.mapper.update(bean);
		}else{
			return this.mapper.insert(bean);
		}
	}

	@Override
	public boolean remove(Integer id) {
		return this.mapper.delete(id);
	}

	@Override
	public House find(Integer id) {
		return this.mapper.selectOne(id);
	}

	@Override
	public List<House> query() {
		return this.mapper.select();
	}
}
