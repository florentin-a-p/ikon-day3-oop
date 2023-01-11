package com.example.demo.inheritance;

public class InheritanceApp {
  public static void main(String[] args) {
    Duck duck = new Duck();
    duck.swim();
    duck.fly();

    MallardDuck mallardDuck = new MallardDuck();
    mallardDuck.swim();
    mallardDuck.fly();
  }
}
