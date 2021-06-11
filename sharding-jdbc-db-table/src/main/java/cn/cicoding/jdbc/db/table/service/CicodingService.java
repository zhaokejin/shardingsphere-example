package cn.cicoding.jdbc.db.table.service;

import cn.cicoding.jdbc.db.table.model.Cicoding;

import java.util.List;

public interface CicodingService {

    List<Cicoding> list();

    Long addLouDong(Cicoding louDong);

}
