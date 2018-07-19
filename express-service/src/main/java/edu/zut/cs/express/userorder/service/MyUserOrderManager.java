package edu.zut.cs.express.userorder.service;


import java.util.List;

import edu.zut.cs.express.base.service.GenericManager;
import edu.zut.cs.express.userorder.domain.MyUserOrder;

/**
 * @author 杨曼珍
 * @Description  接口类，有findByKind，findByName两个方法
 */
public interface MyUserOrderManager extends GenericManager<MyUserOrder, Long> {
	/**
	 * @param kind
	 * @return
	 */
	List<MyUserOrder> findByKind(String kind);

	/**
	 * @param Name
	 * @return
	 */
	List<MyUserOrder> findByName(String name);
}