package model;

import dao.Admin_AccountDAO;

public class Admin_LoginLogic {
  public boolean execute(Admin_Login login) {
    Admin_AccountDAO dao = new Admin_AccountDAO();
    Admin_Account admin_user = dao.findByLogin(login);
    return admin_user != null;
  }
}