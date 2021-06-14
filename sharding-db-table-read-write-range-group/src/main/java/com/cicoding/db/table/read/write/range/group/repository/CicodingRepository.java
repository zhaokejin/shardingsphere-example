package com.cicoding.db.table.read.write.range.group.repository;

import java.util.List;

import com.cicoding.db.table.read.write.range.group.entity.Cicoding;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CicodingRepository {
	
	Long addCicoding(Cicoding cicoding);
	
	List<Cicoding> list();
}
