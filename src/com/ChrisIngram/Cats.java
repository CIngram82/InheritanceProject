package com.ChrisIngram;

public class Cats {
  public String name;
  public int age;
  public double weight;


  public Cats(String name, int age, double weight) {
    this.name = name;
    this.age = age;
    this.weight = weight;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }
}
