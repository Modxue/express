package edu.zut.cs.express.customer.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import edu.zut.cs.express.base.domain.BaseEntity;

/**
 * @author Guozhiliang
 *@Description
 * @Date 2018年6月27日下午2:04:56
 */
@Entity
@Table(name = "T_Customer_Pay")
public class Pay extends BaseEntity {
	
	private static final long serialVersionUID = -4376674977047164142L;
	/*学生ID*/
	@Column
	String idnum;
	/*学生姓名*/
	@Column
	String user_name;
	/*支付费用*/
	@Column
	int user_money;
	/*收取费用*/
	@Column
	int manger_money;

	/* 设置获取 */
	public void setIdnum(String idnum) {
		this.idnum = idnum;
	}

	public String getIdnum() {
		return idnum;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
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