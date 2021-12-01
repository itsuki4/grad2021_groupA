package test;

import dao.Admin_AccountDAO;
import model.Admin_Account;
import model.Admin_Login;


public class AdminDAO {
	 public static void main(String[] args) {
		    testFindByLogin1(); // ユーザーが見つかる場合のテスト
		    testFindByLogin2(); // ユーザーが見つからない場合のテスト
	 		}

	 public static void testFindByLogin1() {
		    Admin_Login login = new Admin_Login("1000", "ito_naoya");
		    Admin_AccountDAO dao = new Admin_AccountDAO();
		    Admin_Account result = dao.findByLogin(login);
		    if (result != null &&
		        result.getAdmin_id().equals("1000") &&
		        result.getAdmin_name1().equals("伊藤 直也") &&
		        result.getAdmin_name2().equals("イトウ ナオヤ") &&
		        result.getAdmin_pass().equals("ito_naoya"))
		        {
		      System.out.println("findByLogin1:成功しました");
		    } else {
		      System.out.println("findByLogin1:失敗しました");
		    }
		  }


		public static void testFindByLogin2() {
		    Admin_Login login = new Admin_Login("1002", "ito_naoya");
		    Admin_AccountDAO dao = new Admin_AccountDAO();
		    Admin_Account result = dao.findByLogin(login);
		    if (result == null) {
		      System.out.println("findByLogin2:成功しました");
		    } else {
		      System.out.println("findByLogin2:失敗しました");
		    }
		  }
		}
