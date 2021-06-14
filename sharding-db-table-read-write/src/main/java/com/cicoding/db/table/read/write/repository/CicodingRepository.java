package com.cicoding.db.table.read.write.repository;

import java.util.List;

import com.cicoding.db.table.read.write.entity.Cicoding;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface CicodingRepository {
	
	Long addCicoding(Cicoding louDong);
	
	List<Cicoding> list();
}
