package com.example.demo.autoboxing;

public class AutoboxingApp {
  public static void main(String[] args) {
    int number = 9;
    Integer numberAutoboxed = Integer.valueOf(number);
    int numberUnboxed = numberAutoboxed.intValue();

    System.out.println(number);
    System.out.println(numberAutoboxed);
    System.out.println(numberAutoboxed);

  }
}
