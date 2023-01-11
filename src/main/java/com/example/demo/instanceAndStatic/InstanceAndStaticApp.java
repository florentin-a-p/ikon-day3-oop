package com.example.demo.instanceAndStatic;

public class InstanceAndStaticApp {
  public static void main(String[] args) {
    SampleInstanceClass sampleInstanceClass = new SampleInstanceClass();
    sampleInstanceClass.printInstanceClass();

    SampleStaticClass.printStaticClass();
  }
}
