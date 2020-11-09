package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.vo.GoodsVo;

@Repository
public interface GoodsDao extends JpaRepository<GoodsVo, Integer>{
	
}
