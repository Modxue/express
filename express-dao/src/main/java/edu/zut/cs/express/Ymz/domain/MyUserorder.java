package edu.zut.cs.express.Ymz.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import edu.zut.cs.express.base.domain.BaseEntity;

/**
 * @author 杨曼珍
 *
 */
@Table(name = "T_USER_ORDER")
@Entity
public class MyUserorder extends BaseEntity {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 76317481406225775L;

	@Column
	String name;
	
	@Column
	String email;
	
	@Column
	String time;
	
	@Column
	String kind;

	@Column
	String expnum;
	

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}
	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getexpnum() {
		return expnum;
	}

	public void setExpnum(String expnum) {
		this.expnum = expnum;
	}

}
