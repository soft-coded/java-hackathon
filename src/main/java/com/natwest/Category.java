package com.natwest;

public class Category {
  private int typeId, interest;
  private String typeName;

  // default constructor
  public Category() {
  }

  // parameterised constructor, only need typeId here
  public Category(int typeId) {
    this.typeId = typeId; // 1 for savings, 2 for salary
    this.interest = typeId == 1 ? 6 : 0;
    this.typeName = typeId == 1 ? "Savings" : "Salary";
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
