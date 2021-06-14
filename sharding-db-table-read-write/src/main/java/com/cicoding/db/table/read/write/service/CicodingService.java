package com.cicoding.db.table.read.write.service;

import java.util.List;

import com.cicoding.db.table.read.write.entity.Cicoding;

public interface CicodingService {

	List<Cicoding> list();
	
	Long addCicoding(Cicoding louDong);
		
}
