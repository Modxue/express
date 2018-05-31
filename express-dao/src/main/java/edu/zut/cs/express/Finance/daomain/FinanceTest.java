package edu.zut.cs.express.Finance.daomain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import edu.zut.cs.express.base.domain.BaseEntity;

@Table(name = "T_Finance_Test")
@Entity
public class FinanceTest extends BaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Column
	String name;
	
	@Column
	double money;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}
	
	

}
