package cn.cicoding.jdbc.db.table.repository;

import cn.cicoding.jdbc.db.table.model.Cicoding;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CicodingRepository {

    Long addCicoding(Cicoding louDong);

    List<Cicoding> list();
}
