package cn.cicoding.db.sharding.service;

import cn.cicoding.db.sharding.entity.Cicoding;
import cn.cicoding.db.sharding.repository.CicodingRepository;
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
	public Long addCicoding(Cicoding cicoding) {
		return cicodingRepository.addCicoding(cicoding);
	}

}
