package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class PlayerTest {

  @Test
  public void playerHasNameAndLevel() {
    Player player = new Player("勇者", 5);

    assertEquals("勇者", player.getName());
    assertEquals(5, player.getLevel());
  }

}
