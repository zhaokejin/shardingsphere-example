package cn.cicoding.db.sharding.repository;

import cn.cicoding.db.sharding.entity.Cicoding;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface CicodingRepository {
	
	Long addCicoding(Cicoding cicoding);
	
	List<Cicoding> list();
}
