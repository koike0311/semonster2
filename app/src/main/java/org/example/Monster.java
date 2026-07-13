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

  public static Monster summonMonster(int number) {
    String summonedName;
    int defaultRarity = 1;

    switch (number) {
      case 0:
        summonedName = "スライム";
        break;
      case 1:
        summonedName = "ゴブリン";
        break;
      case 2:
        summonedName = "デュラハン";
        break;
      case 3:
        summonedName = "ドラゴン";
        break;
      case 4:
        summonedName = "フェニックス";
        break;
      default:
        summonedName = "未知のモンスター";
        break;
    }
    return new Monster(summonedName, defaultRarity);
  }

  @Override
  public String toString() {
    return "Monster{name='" + name + "', rarity=" + rarity + "}";
  }
}
