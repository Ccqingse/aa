package com.hz.boot09.pojo;

import lombok.Data;

@Data
public class SmbmsBill {

  private long id;
  private String billCode;
  private String productName;
  private String productDesc;
  private String productUnit;
  private double productCount;
  private double totalPrice;
  private long isPayment;
  private long createdBy;
  private String creationDate;
  private long modifyBy;
  private String modifyDate;
  private long providerId;




}
