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
}
