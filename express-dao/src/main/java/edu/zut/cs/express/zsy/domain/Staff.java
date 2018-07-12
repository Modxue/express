package edu.zut.cs.express.zsy.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import edu.zut.cs.express.base.domain.BaseEntity;

/**
 * @author:zsy0216
 * @Description:defined entity class
 */

@Entity
@Table(name = "T_Staff")
public class Staff extends BaseEntity {

	/**
	 * class staff defined
	 */

	private static final long serialVersionUID = 1L;

	/**
	 * defined class satff's attributes
	 */

	@Column
	String idnum;

	@Column
	String name;

	@Column
	int age;

	@Column
	String sex;

	/**
	 * defined class staff methods
	 * 
	 * @return
	 */

	public String getIDnum() {
		return idnum;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getSex() {
		return sex;
	}
	
	public void setIDnum(String idnum) {
		this.idnum = idnum;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

}
