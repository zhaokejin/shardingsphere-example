package com.cicoding.table.read.write.controller;

import com.cicoding.table.read.write.po.Cicoding;
import com.cicoding.table.read.write.service.CicodingService;
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
			Cicoding cicoding = new Cicoding();
			cicoding.setId(i+"a");
			cicoding.setCity("深圳");
			cicoding.setRegion("宝安");
			cicoding.setName("李四");
			cicoding.setLdNum("A");
			cicoding.setUnitNum("2");
			cicodingService.addLouDong(cicoding);
		}
		return "success";
	}
	
}
