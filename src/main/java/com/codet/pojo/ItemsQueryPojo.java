package com.codet.pojo;

public class ItemsQueryPojo {

	// 商品类扩展
	private ItemExtend itemExtend;

	// 商品类别
	private Itemtype itemtype;

	// 商品等级
	private Itemlevel itemlevel;

	
	public ItemExtend getItemExtend() {
		return itemExtend;
	}

	public void setItemExtend(ItemExtend itemExtend) {
		this.itemExtend = itemExtend;
	}

	public Itemtype getItemtype() {
		return itemtype;
	}

	public void setItemtype(Itemtype itemtype) {
		this.itemtype = itemtype;
	}

	public Itemlevel getItemlevel() {
		return itemlevel;
	}

	public void setItemlevel(Itemlevel itemlevel) {
		this.itemlevel = itemlevel;
	}


}
