package com.cicoding.db.table.read.write.range.group.service;

import java.util.List;

import com.cicoding.db.table.read.write.range.group.entity.Cicoding;

public interface CicodingService {

	List<Cicoding> list();

	Long addCicoding(Cicoding cicoding);

}
