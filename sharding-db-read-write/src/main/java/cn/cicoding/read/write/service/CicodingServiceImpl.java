package cn.cicoding.read.write.service;

import cn.cicoding.read.write.model.Cicoding;
import cn.cicoding.read.write.repository.CicodingRepository;
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
