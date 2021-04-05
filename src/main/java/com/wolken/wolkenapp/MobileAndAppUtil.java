package com.wolken.wolkenapp;

import java.util.logging.Logger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wolken.wolkenapp.bean.AppsBean;
import com.wolken.wolkenapp.bean.MobileBean;

public class MobileAndAppUtil {
	static Logger logger=Logger.getLogger("MobilesUtil");
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("context.xml");
		MobileBean bean=applicationContext.getBean(MobileBean.class);
		logger.info("MobileName:"+bean.getMobileName()+"Price:"+bean.getPrice()+"Proccessor:"+bean.getProcessor());
		AppsBean appsBean=applicationContext.getBean(AppsBean.class);
		logger.info("AppName:"+appsBean.getAppName()+"purpose:"+appsBean.getPurpose());
		
	}

}
