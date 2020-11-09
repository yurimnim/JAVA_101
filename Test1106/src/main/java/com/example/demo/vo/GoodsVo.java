package com.example.demo.vo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="goods")
public class GoodsVo {
	
	@Id
	private int no;
	private String name;
	private int price;
	private int qty;
	private String fname;
	
}
