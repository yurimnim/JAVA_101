package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.GoodsDao;
import com.example.demo.vo.GoodsVo;

@Service
public class GoodsService {
	
	@Autowired
	private GoodsDao dao;
	
	public List<GoodsVo> findAll(){
		return dao.findAll();
	}
}
