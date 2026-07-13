package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class MonsterActionTest {

  @Test
  public void attackActionReturnsCorrectMessage() {
    // レア度3のドラゴンを生成してテスト
    Monster monster = new Monster("ドラゴン", 3);
    MonsterAction attack = new AttackAction();

    String expectedMessage = "ドラゴンの攻撃！ 30のダメージを与えた！";
    assertEquals(expectedMessage, attack.execute(monster));
  }
}
