package com.cicoding.table.read.write.repository;

import java.util.List;

import com.cicoding.table.read.write.po.Cicoding;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface CicodingRepository {
	
	Long addLouDong(Cicoding louDong);
	
	List<Cicoding> list();
}
