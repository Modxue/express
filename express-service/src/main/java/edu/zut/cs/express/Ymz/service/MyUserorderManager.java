package edu.zut.cs.express.Ymz.service;


import java.util.List;

import edu.zut.cs.express.Ymz.domain.MyUserorder;
import edu.zut.cs.express.base.service.GenericManager;

/**
 * @author 杨曼珍
 *
 */
public interface MyUserorderManager extends GenericManager<MyUserorder, Long> {

	List<MyUserorder> findByKind(String kind);

	List<MyUserorder> findByName(String name);
}