package org.example;

public class App {

  public String getGreeting() {
    return "こんにちは SEMonster";
  }

  public static void main(String[] args) {
    System.out.println(new App().getGreeting());

    Monster monster = new Monster("スライム", 2);
    System.out.println(monster);

    // --- 追加部分 ---
    // アクションのインスタンスを生成し、モンスターに実行させる
    MonsterAction attackAction = new AttackAction();
    String result = attackAction.execute(monster);

    System.out.println(result); // 出力例: スライムの攻撃！ 20のダメージを与えた！
  }
}
