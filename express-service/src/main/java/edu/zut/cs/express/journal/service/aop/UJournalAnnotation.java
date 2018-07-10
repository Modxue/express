package edu.zut.cs.express.journal.service.aop;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
* @author GreyYa
* @version 创建时间：2018年7月2日 下午2:24:13
* 添加自定义注解，并且定义两个属性
*/

@Target({ElementType.PARAMETER, ElementType.METHOD})      
@Retention(RetentionPolicy.RUNTIME)      
@Documented  

public @interface UJournalAnnotation {
	
	/**
	* 日志描述
	*/
	String description()  default ""; 
	
	/**
	* 操作表类型
	*/
	int tableType() default 0;
}
