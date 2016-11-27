package com.rishi.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="PRODUCT")
public class Product {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pro_id;
	
	@Size(min=3, max=50)
    @Column(name = "NAME", nullable = false)
    private String pro_name;

	@NotNull
	@Digits(integer=8, fraction=2)
    @Column(name = "COST", nullable = false)
    private BigDecimal pro_cost;
	
	@NotEmpty
	@Column(name = "DESCP", nullable = false)
	private String Descp;
	
	public int getId()
	{
		return pro_id;
	}
	
	public void setId(int pro_id)
	{
		this.pro_id=pro_id;
	}
	public void setName(String pro_name) 
	{
        this.pro_name = pro_name;
    }
	public BigDecimal getcost() 
	{
	        return pro_cost;
	}
	public void setcost(BigDecimal pro_cost) {
        this.pro_cost = pro_cost;
    }
	public String getdescp() {
	        return Descp;
	}
	public void setDescp(String Descp) {
        this.Descp = Descp;
    }
}