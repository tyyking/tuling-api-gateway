package com.bit.api.service;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.bit.api.core.APIMapping;

@Service
//goodsServiceImpl 
public class GoodsServiceImpl {
	//无缝集成 
	@APIMapping("bit.api.goods.add")
	public Goods addGoods(Goods goods,Integer id){
		return goods;
	}
	
	public static class Goods implements Serializable{
		private String goodsName;
		private String goodsId; 
		
		public String getGoodsName() {
			return goodsName;
		}
		public void setGoodsName(String goodsName) {
			this.goodsName = goodsName;
		}
		public String getGoodsId() {
			return goodsId;
		}
		public void setGoodsId(String goodsId) {
			this.goodsId = goodsId;
		}
	}
}
