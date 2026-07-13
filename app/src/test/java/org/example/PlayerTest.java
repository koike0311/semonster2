package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class PlayerTest {

  @Test
  public void playerHasNameAndLevel() {
    Player player = new Player("Knight", 5);

    assertEquals("Knight", player.getName());
    assertEquals(5, player.getLevel());
  }

}
