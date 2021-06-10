package cn.cicoding.read.write.repository;

import cn.cicoding.read.write.model.Cicoding;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CicodingRepository {
	
	Long addCicoding(Cicoding louDong);
	
	List<Cicoding> list();
}
