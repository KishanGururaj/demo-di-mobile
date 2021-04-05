package com.wolken.wolkenapp.bean;

import java.util.logging.Logger;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Setter
@Getter
@ToString

public class AppsBean {
	Logger logger=Logger.getLogger("AppsBean");
	private String appName;
	private String purpose;
	public void app() {
		logger.info(appName+" "+purpose);
	}
	public AppsBean( String appName, String purpose) {
		
		this.appName = appName;
		this.purpose = purpose;
	}
	

}
