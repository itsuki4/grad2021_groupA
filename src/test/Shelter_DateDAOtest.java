package test;

import java.util.List;

import dao.Shelter_DateDAO;
import model.Shelter_Date;

public class Shelter_DateDAOtest {
	  public static void main(String[] args) {

		    // employeeテーブルの全レコードを取得
		  Shelter_DateDAO shelterDAO = new Shelter_DateDAO();
		    List<Shelter_Date> shelterList = shelterDAO.findAll();

		    // 取得したレコードの内容を出力
		    for (Shelter_Date emp : shelterList) {
		    	System.out.println(" ");
		      System.out.println("ID:" + emp.getId());
		      System.out.println("施設名:" + emp.getShelter_name1());
		      System.out.println("施設名（カタカナ）：" + emp.getShelter_name2());
		      System.out.println("郵便番号：" + emp.getShelter_address1());
		      System.out.print("住所：" + emp.getShelter_address2());
		      System.out.print(emp.getShelter_address3());
		      System.out.println(emp.getShelter_address4());
		      System.out.println("電話番号:" + emp.getTel());
		      System.out.println("定員数:" + emp.getCapacity());
		    }
		  }
}
