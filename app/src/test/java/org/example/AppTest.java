package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

  @Test
  public void appHasGreeting() {
    App app = new App();

    assertEquals("こんにちは SEMonster", app.getGreeting());
  }
}
