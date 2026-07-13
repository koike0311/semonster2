package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class MonsterTest {

  @Test
  public void monsterHasNameAndRarity() {
    Monster monster = new Monster("スライム", 2);

    assertEquals("スライム", monster.getName());
    assertEquals(2, monster.getRarity());
  }

  @Test
  public void summonMonsterReturnsCorrectMonster() {
    Monster monster = Monster.summonMonster(3);

    assertEquals("ドラゴン", monster.getName());
    assertEquals(1, monster.getRarity());
  }
}
