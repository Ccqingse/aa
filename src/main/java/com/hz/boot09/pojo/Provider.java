package com.hz.boot09.pojo;

import lombok.Data;

@Data
public class Provider {
	
	private Integer id;   //id
	private String proCode; //供应商编码
	private String proName; //供应商名称
	private String proDesc; //供应商描述
	private String proContact; //供应商联系人
	private String proPhone; //供应商电话
	private String proAddress; //供应商地址
	private String proFax; //供应商传真
	private Integer createdBy; //创建者
	private String creationDate; //创建时间
	private Integer modifyBy; //更新者
	private String modifyDate;//更新时间
	private Integer sex;
	private String addtime;
	private String experience;   //联系地址
	private String score;			//创建时间
	
	
}
