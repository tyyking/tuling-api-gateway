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

	@APIMapping("bit.api.goods.get")
	public Goods getGodds(Integer id){
		return new Goods("vvv","1111");
	}
	public static class Goods implements Serializable{
		private String goodsName;
		private String goodsId;
		public Goods(){

		}
		public Goods(String goodsName, String goodsId) {
			this.goodsName = goodsName;
			this.goodsId = goodsId;
		}

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
