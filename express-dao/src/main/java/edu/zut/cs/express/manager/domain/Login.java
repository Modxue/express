package edu.zut.cs.express.manager.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import edu.zut.cs.express.base.domain.BaseEntity;
import edu.zut.cs.express.manager.domain.Group;

@Table(name = "T_ADMIN_Login")
@Entity
public class Login extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4376674977047164142L;

	@Column(name = "USERNAME")//用户姓名
	String username;
	
    @Column(name="USER_ID")//用户ID
    
    String user_id;
	@Column(name = "PASSWORD")//用户登录密码
	String password;

	@Column(name="TIME")//用户登陆时间
	String time;
	@Column(name = "EMAIL")//用户邮箱
	String email;
    @Column(name="MESSAGE")//用户留言内容
    String message;
    public String getMESSAGE() {
    	return message;
    }
    public void setMESSAGE(String message) {
    	this.message=message;
    }
	public String getUsername() {
		return username;
	}

	public String getUSER_ID() {
		return user_id;
	}
	
	public void setUSER_ID(String user_id) {
		this.user_id=user_id;
	}
	public String getTIME() {
		return time;
	}
	public void setTIME(String time) {
		this.time=time;
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

}
