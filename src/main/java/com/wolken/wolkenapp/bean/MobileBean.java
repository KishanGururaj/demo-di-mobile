package com.wolken.wolkenapp.bean;

import java.util.logging.Logger;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Setter
@Getter
@ToString
@NoArgsConstructor
public class MobileBean {
	Logger logger= Logger.getLogger("MobileBean");
	private String mobileName;
	private int price;
	private String processor;
	private AppsBean appsBean;
	public void calling () {
		logger.info("inside calling ");
		
	}

}
