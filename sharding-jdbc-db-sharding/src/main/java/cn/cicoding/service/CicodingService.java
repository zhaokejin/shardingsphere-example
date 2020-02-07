package cn.cicoding.service;

import java.util.List;

import cn.cicoding.entity.Cicoding;

public interface CicodingService {

	List<Cicoding> list();
	
	Long addCicoding(Cicoding cicoding);
		
}
