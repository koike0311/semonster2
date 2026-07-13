package org.example;

public class AttackAction implements MonsterAction {
  @Override
  public String execute(Monster actor) {
    // レア度を元にダメージを計算する（例：レア度 × 10）
    int damage = actor.getRarity() * 10;
    return actor.getName() + "の攻撃！ " + damage + "のダメージを与えた！";
  }
}
