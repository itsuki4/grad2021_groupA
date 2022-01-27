package model;

import dao.AccountDAO;
import staff_login.Account;
import staff_login.Login;

public class LoginLogic {
  public boolean execute(Login login) {
    AccountDAO dao = new AccountDAO();
    Account account = dao.findByLogin(login);
    return account != null;
  }
}