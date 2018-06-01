package edu.zut.cs.express.customer.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import edu.zut.cs.express.base.domain.BaseEntity;
import edu.zut.cs.express.manager.domain.Group;
import edu.zut.cs.express.manager.domain.Manger;
import edu.zut.cs.express.manager.domain.user;

@Table(name = "T_ADMIN_Pay")
@Entity
public class Pay extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4376674977047164142L;

	@Column(name = "user")
	user use;
	@Column(name = "manger")
	Manger manger;

	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}
	
	@ManyToOne
	@JoinColumn(name = "GROUP_ID")
	Group group;


	public user getUse() {
		return use;
	}

	public void setUse(user use) {
		this.use = use;
	}

	public Manger getManger() {
		return manger;
	}

	public void setManger(Manger manger) {
		this.manger = manger;
	}

}

