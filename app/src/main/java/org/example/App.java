package org.example;

public class App {

  public String getGreeting() {
    return "こんにちは SEMonster";
  }

  public static void main(String[] args) {
    System.out.println(new App().getGreeting());

    Monster monster = new Monster("スライム", 2);
    System.out.println(monster);
  }
}
