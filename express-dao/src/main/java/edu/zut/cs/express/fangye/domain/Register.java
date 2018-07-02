package edu.zut.cs.express.fangye.domain;

import javax.persistence.Column;  //标识实体类中属性与数据表的对应
import javax.persistence.Entity;  //说明Java类是实体类
import javax.persistence.Table;   //指定数据库对应的表
import edu.zut.cs.express.base.domain.BaseEntity;

/**
 * @author FangYe
 *  定义实体类
 */
@Table(name = "t_Register")
@Entity
public class Register extends BaseEntity {

	private static final long serialVersionUID = -4376674977047164142L;

	@Column
	String idnum;
	
	@Column
	String username;

	@Column
	String password;

	@Column
	String email;
	
	@Column
	String sex;
	
	@Column
	String phone;
	

	public String getIdnum() {
		return idnum;
	}

	public void setIdnum(String idnum) {
		this.idnum = idnum;
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}
