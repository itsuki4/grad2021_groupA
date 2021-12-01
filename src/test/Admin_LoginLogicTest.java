package test;

import model.Admin_Login;
import model.Admin_LoginLogic;

public class Admin_LoginLogicTest {
  public static void main(String[] args) {
    testExecute1(); // ログイン成功のテスト
    testExecute2(); // ログイン失敗のテスト
  }

  public static void testExecute1() {
    Admin_Login login = new Admin_Login("1000", "ito_naoya");
    Admin_LoginLogic bo = new Admin_LoginLogic();
    boolean result = bo.execute(login);
    if (result) {
      System.out.println("testExcecute1:成功しました");
    } else {
      System.out.println("testExcecute1:失敗しました");
    }
  }

  public static void testExecute2() {
    Admin_Login login = new Admin_Login("1002", "ito_naoya");
    Admin_LoginLogic bo = new Admin_LoginLogic();
    boolean result = bo.execute(login);
    if (!result) {
      System.out.println("testExcecute2:成功しました");
    } else {
      System.out.println("testExcecute2:失敗しました");
    }
  }
}