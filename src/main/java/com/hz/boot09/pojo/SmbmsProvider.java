package com.hz.boot09.pojo;

import lombok.Data;

@Data
public class SmbmsProvider {

  private long id;
  private String proCode;
  private String proName;
  private String proDesc;
  private String proContact;
  private String proPhone;
  private String proAddress;
  private String proFax;
  private long sex;
  private java.sql.Timestamp creationDate;
  private java.sql.Timestamp modifyDate;
  private long modifyBy;
  private java.sql.Timestamp addtime;
  private String experience;
  private java.sql.Timestamp score;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getProCode() {
    return proCode;
  }

  public void setProCode(String proCode) {
    this.proCode = proCode;
  }


  public String getProName() {
    return proName;
  }

  public void setProName(String proName) {
    this.proName = proName;
  }


  public String getProDesc() {
    return proDesc;
  }

  public void setProDesc(String proDesc) {
    this.proDesc = proDesc;
  }


  public String getProContact() {
    return proContact;
  }

  public void setProContact(String proContact) {
    this.proContact = proContact;
  }


  public String getProPhone() {
    return proPhone;
  }

  public void setProPhone(String proPhone) {
    this.proPhone = proPhone;
  }


  public String getProAddress() {
    return proAddress;
  }

  public void setProAddress(String proAddress) {
    this.proAddress = proAddress;
  }


  public String getProFax() {
    return proFax;
  }

  public void setProFax(String proFax) {
    this.proFax = proFax;
  }


  public long getSex() {
    return sex;
  }

  public void setSex(long sex) {
    this.sex = sex;
  }


  public java.sql.Timestamp getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(java.sql.Timestamp creationDate) {
    this.creationDate = creationDate;
  }


  public java.sql.Timestamp getModifyDate() {
    return modifyDate;
  }

  public void setModifyDate(java.sql.Timestamp modifyDate) {
    this.modifyDate = modifyDate;
  }


  public long getModifyBy() {
    return modifyBy;
  }

  public void setModifyBy(long modifyBy) {
    this.modifyBy = modifyBy;
  }


  public java.sql.Timestamp getAddtime() {
    return addtime;
  }

  public void setAddtime(java.sql.Timestamp addtime) {
    this.addtime = addtime;
  }


  public String getExperience() {
    return experience;
  }

  public void setExperience(String experience) {
    this.experience = experience;
  }


  public java.sql.Timestamp getScore() {
    return score;
  }

  public void setScore(java.sql.Timestamp score) {
    this.score = score;
  }

}
