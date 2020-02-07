package cn.cicoding.repository;

import java.util.List;

import cn.cicoding.entity.Cicoding;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface CicodingRepository {
	
	Long addCicoding(Cicoding cicoding);
	
	List<Cicoding> list();
}
