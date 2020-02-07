package cn.cicoding.controller;

import cn.cicoding.entity.Cicoding;
import cn.cicoding.service.CicodingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CicodingController {
	
	@Autowired
	private CicodingService cicodingService;
	
	@GetMapping("/cis")
	public Object list() {
		return cicodingService.list();
	}
	
	@GetMapping("/ci/add")
	public Object add() {
		for (long i = 0; i < 10; i++) {
			Cicoding cicoding = new Cicoding();
			cicoding.setId(i+"a");
			cicoding.setCity("深圳");
			cicoding.setRegion("宝安");
			cicoding.setName("李四");
			cicoding.setLdNum("A");
			cicoding.setUnitNum("2");
			cicodingService.addCicoding(cicoding);
		}
		return "success";
	}
	
}
