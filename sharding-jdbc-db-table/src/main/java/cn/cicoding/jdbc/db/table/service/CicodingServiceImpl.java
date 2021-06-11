package cn.cicoding.jdbc.db.table.service;

import cn.cicoding.jdbc.db.table.model.Cicoding;
import cn.cicoding.jdbc.db.table.repository.CicodingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CicodingServiceImpl implements CicodingService {

	@Autowired
	private CicodingRepository cicodingRepository;
	
	@Override
	public List<Cicoding> list() {
		return cicodingRepository.list();
	}

	@Override
	public Long addLouDong(Cicoding louDong) {
		return cicodingRepository.addCicoding(louDong);
	}

}
