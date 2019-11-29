package com.imagegrafia.petrolpump.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imagegrafia.petrolpump.entity.Totalizer;
import com.imagegrafia.petrolpump.repository.TotalizerRepository;

@Service
public class TotalizerService {
	@Autowired
	private TotalizerRepository totalizerRepository;

	public List<Totalizer> getAllList() {
		List<Totalizer> lists = new ArrayList<>();
		Totalizer t1 = new Totalizer(1000, 2000, new Date());
		Totalizer t2 = new Totalizer(2000, 4000, new Date());
		Totalizer t3 = new Totalizer(3000, 6000, new Date());
		lists.add(t1);
		lists.add(t2);
		lists.add(t3);
		System.out.println(lists);
		return lists;

	}
}
