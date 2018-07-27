package com.orilore.model;
public class Kinds{
	private Integer id;
	public void setId(Integer id){
		this.id=id;
	}
	public Integer getId(){
		return this.id;
	}
	private Integer nums;
	public void setNums(Integer nums){
		this.nums=nums;
	}
	public Integer getNums(){
		return this.nums;
	}
	private String name;
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return this.name;
	}
	private Double price;
	public void setPrice(Double price){
		this.price=price;
	}
	public Double getPrice(){
		return this.price;
	}
}