package org.zerock.domain;

import java.util.Date;

import lombok.Data;

@Data
public class boardVO {
	
	private int bno;
	private String btitle;
	private String bcontent;
	private String bwriter;
	private Date bdate;
	
	
}
