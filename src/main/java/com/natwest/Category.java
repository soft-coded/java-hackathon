package com.natwest;

public class Category {
  private int typeId, interest;
  private String typeName;

  // default constructor
  public Category() {
  }

  // parameterised constructor
  public Category(int typeId, int interest, String typeName) {
    this.typeId = typeId;
    this.interest = interest;
    this.typeName = typeName;
  }

  public int getTypeId() {
    return typeId;
  }

  public void setTypeId(int typeId) {
    this.typeId = typeId;
  }

  public int getInterest() {
    return interest;
  }

  public void setInterest(int interest) {
    this.interest = interest;
  }

  public String getTypeName() {
    return typeName;
  }

  public void setTypeName(String typeName) {
    this.typeName = typeName;
  }

  @Override
  public String toString() {
    return "Category [typeId=" + typeId + ", interest=" + interest + ", typeName=" + typeName + "]";
  }

}
