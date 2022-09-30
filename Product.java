package com.satyam.day3.beans;

public class Product implements Comparable {
	//private properties
		private int id;
		private String name;
		private float qty;
		private String type;
		
	//no-arg constructor	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(int id, String name, float qty, String type) {
		super();
		this.id = id;
		this.name = name;
		this.qty = qty;
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getQty() {
		return qty;
	}

	public void setQty(float qty) {
		this.qty = qty;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", qty=" + qty + ", type=" + type + "]";
	}

	@Override
	public int compareTo(Object o) {
		
		Product p2=(Product)o;
		
		if(this.id==p2.id && this.name.equals(p2.name) && this.qty==p2.qty && this.type.equals(p2.type))
		{
			return 1;
		}else
		{
			return 0;
		}
		
		
	}

	@Override
	protected void finalize()
	{
			System.out.println("Product is going to be garbage collected!!!");
	}
	
}
