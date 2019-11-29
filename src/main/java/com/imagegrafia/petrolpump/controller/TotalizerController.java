package com.imagegrafia.petrolpump.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.imagegrafia.petrolpump.entity.Totalizer;
import com.imagegrafia.petrolpump.service.TotalizerService;

@RestController
@RequestMapping("/")
public class TotalizerController {
	@Autowired
	private TotalizerService totalizerService;
	
	@GetMapping
	public List<Totalizer> getTotalizerList() {
		return totalizerService.getAllList();
	}

}
