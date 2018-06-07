package edu.zut.cs.express.customer.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import edu.zut.cs.express.base.domain.BaseEntity;

@Table(name = "T_Customer_Pay")
@Entity
public class Pay extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4376674977047164142L;

	@Column
	String idnum;

	public void setIdnum(String idnum) {
		this.idnum = idnum;
	}


	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}


	public String getIdnum() {
		return idnum;
	}

	@Column
	String user_name;
	@Column
	int user_money;
	@Column
	int manger_money;

	public String getUser_name() {
		return user_name;
	}


	public int getUser_money() {
		return user_money;
	}

	public void setUser_money(int user_money) {
		this.user_money = user_money;
	}

	public int getManger_money() {
		return manger_money;
	}

	public void setManger_money(int manger_money) {
		this.manger_money = manger_money;
	}

}
