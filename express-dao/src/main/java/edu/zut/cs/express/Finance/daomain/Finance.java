package edu.zut.cs.express.Finance.daomain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import edu.zut.cs.express.base.domain.BaseEntity;

@Table(name = "T_Finance_Test")
@Entity
public class Finance extends BaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Column
	String idnum;
	
	@Column
	String name;
	
	@Column
	String sex;
	
	@Column
	int age;
	
	@Column
	double money;

	public String getIDnum() {
		return idnum;
	}

	public void setIDnum(String idnum) {
		this.idnum = idnum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}
	
	

}
