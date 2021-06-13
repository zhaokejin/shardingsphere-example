package com.cicoding.table.read.write.service;

import java.util.List;

import com.cicoding.table.read.write.po.Cicoding;

public interface CicodingService {

	List<Cicoding> list();
	
	Long addLouDong(Cicoding cicoding);
		
}
