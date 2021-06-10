package cn.cicoding.read.write.controller;

import cn.cicoding.read.write.model.Cicoding;
import cn.cicoding.read.write.service.CicodingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CicodingController {
	
	@Autowired
	private CicodingService cicodingService;
	
	@GetMapping("/lds")
	public Object list() {
		return cicodingService.list();
	}
	
	@GetMapping("/ld/add")
	public Object add() {
		for (long i = 0; i < 10; i++) {
			Cicoding louDong = new Cicoding();
			louDong.setId(i+"a");
			louDong.setCity("深圳");
			louDong.setRegion("宝安");
			louDong.setName("李四");
			louDong.setLdNum("A");
			louDong.setUnitNum("2");
			cicodingService.addLouDong(louDong);
		}
		return "success";
	}
	
}
