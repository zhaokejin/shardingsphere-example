package com.cicoding.db.table.read.write.service;

import java.util.List;

import com.cicoding.db.table.read.write.entity.Cicoding;
import com.cicoding.db.table.read.write.repository.CicodingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CicodingServiceImpl implements CicodingService {

	@Autowired
	private CicodingRepository cicodingRepository;
	
	@Override
		public List<Cicoding> list() {
		return cicodingRepository.list();
	}

	@Override
	public Long addCicoding(Cicoding cicoding) {
		return cicodingRepository.addCicoding(cicoding);
	}

}
