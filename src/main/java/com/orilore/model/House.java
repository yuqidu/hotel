package com.orilore.model;
public class House{
	private Integer id;
	public void setId(Integer id){
		this.id=id;
	}
	public Integer getId(){
		return this.id;
	}
	private String nums;
	public void setNums(String nums){
		this.nums=nums;
	}
	public String getNums(){
		return this.nums;
	}
	private Integer kid;
	public void setKid(Integer kid){
		this.kid=kid;
	}
	public Integer getKid(){
		return this.kid;
	}
	private Integer status;
	public void setStatus(Integer status){
		this.status=status;
	}
	public Integer getStatus(){
		return this.status;
	}
}