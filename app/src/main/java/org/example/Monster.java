package org.example;

public class Monster {

  private String name;
  private int rarity;

  public Monster(String name, int rarity) {
    this.name = name;
    this.rarity = rarity;
  }

  public String getName() {
    return name;
  }

  public int getRarity() {
    return rarity;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setRarity(int rarity) {
    if (rarity >= 0 && rarity <= 4) {
      this.rarity = rarity;
    } else {
      throw new IllegalArgumentException("レア度は0～4です。");
    }
  }

  @Override
  public String toString() {
    return "Monster{name='" + name + "', rarity=" + rarity + "}";
  }
}
