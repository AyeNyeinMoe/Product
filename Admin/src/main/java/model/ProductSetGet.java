package model;


public class ProductSetGet {
	private int id;
	private String name;
	private int price;
	private int qty;
	private String date;
	
	public ProductSetGet() {}
	public ProductSetGet(int id,String name,int price,int qty,String date) {
		this.id=id;
		this.name=name;
		this.price=price;
		this.qty=qty;
		this.date=date;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	
}
