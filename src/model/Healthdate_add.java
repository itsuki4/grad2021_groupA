
package model;

public class Healthdate_add {

	private int person_id; //児童ID
	private int person_body; //身長
	private int person_check; //体重
	private int person_datail; //体重の状態
	private String allergies; //アレルギー７品目
	private int allergies_degree; //アレルギー症状の程度
	private String allergies_remarks; //アレルギー備考欄
	private String chronic_condition; //病気・薬
	private String chronic_correspondence; //病気の対応
	private int insomnia; //不眠
	private int frightened; //不安・怯え
	private int depression; //抑うつ
	private String mental_remarks; //精神症状備考欄
	private int suicide; //自殺行為
	private int dehydration; //脱水症状
	private int malnutrition; //栄養不足
	private int unbalanced_diet; //偏食
	private String unbalanced_remarks; //偏食備考欄
	private String 	scratch_point; //傷の部位
	private int scratch_number; //傷の数
	private int scratch_size; //傷の大きさ
	private int scratch_colour; //傷の色
	private String scratch_remarks; //傷の備考欄
	private int hindrance; //障害の有無
	private String person_remarks; //児童の備考欄

	public Healthdate_add() {};

	public Healthdate_add(int person_id,int person_body,
			int person_check,
			int person_datail,
			String allergies,
			int allergies_degree,
			String allergies_remarks,
			String chronic_condition,
			String chronic_correspondence,
			int insomnia,
			int frightened,
			int depression,
			String mental_remarks,
			int suicide,
			int dehydration,
			int malnutrition,
			int unbalanced_diet,
			String unbalanced_remarks,
			String 	scratch_point,
			int scratch_number,
			int scratch_size,
			int scratch_colour,
			String scratch_remarks,
			int hindrance,
			String person_remarks) {

		this.person_id = person_id;
		this.person_body = person_body;
		this.person_check = person_check;
		this.person_datail= person_datail;
		this.allergies = allergies;
		this.allergies_degree =  allergies_degree;
		this.allergies_remarks = allergies_remarks;
		this.chronic_condition = chronic_condition;
		this.chronic_correspondence = chronic_correspondence;
		this.insomnia = insomnia;
		this.frightened = frightened;
		this.depression = depression;
		this.mental_remarks =  mental_remarks;
		this.suicide = suicide;
		this.dehydration = dehydration;
		this.malnutrition = malnutrition;
		this.unbalanced_diet = unbalanced_diet;
		this.unbalanced_remarks = unbalanced_remarks;
		this.scratch_point = scratch_point;
		this.scratch_number = scratch_number;
		this.scratch_size = scratch_size;
		this.scratch_colour = scratch_colour;
		this.scratch_remarks = scratch_remarks;
		this.hindrance = hindrance;
		this.person_remarks = person_remarks;
	}
	public int getPerson_id() {return person_id; }
	public int getPerson_body() {return person_body; }
	public int getPerson_check() {return person_check; }
	public int getPerson_datail() {return person_datail; }
	public String getAllergies() {return allergies; }
	public int getAllergies_degree() {return allergies_degree; }
	public String getAllergies_remarks() {return allergies_remarks; }
	public String getChronic_condition() {return chronic_condition; }
	public String getChronic_correspondence() {return chronic_correspondence; }
	public int getInsomnia() {return insomnia; }
	public int getFrightened() {return frightened; }
	public int getDepression() {return depression; }
	public String getMental_remarks() {return mental_remarks; }
	public int getSuicide() {return suicide; }
	public int getDehydration() {return dehydration; }
	public int getMalnutrition() {return malnutrition; }
	public int getUnbalanced_diet() {return unbalanced_diet; }
	public String getUnbalanced_remarks() {return unbalanced_remarks; }
	public String getScratch_point() {return scratch_point; }
	public int getScratch_number() {return scratch_number; }
	public int getScratch_size() {return scratch_size; }
	public int getScratch_colour() {return scratch_colour; }
	public String getScratch_remarks() {return scratch_remarks; }
	public int getHindrance() {return hindrance; }
	public String getPerson_remarks() {return person_remarks; }


	public void setPerson_id(int person_id) { this.person_id = person_id;}
	public void setPerson_body(int person_body) { this.person_body = person_body; }
	public void setPerson_check(int person_check) {this.person_check = person_check; }
	public void setPerson_datail(int person_datail) { this.person_datail= person_datail; }
	public void setAllergies(String allergies) { this.allergies = allergies; }
	public void setAllergies_degree(int allergies_degree) { this.allergies_degree =  allergies_degree; }
	public void setAllergies_remarks(String allergies_remarks) { this.allergies_remarks = allergies_remarks; }
	public void setChronic_condition(String chronic_condition) { this.chronic_condition = chronic_condition; }
	public void setChronic_correspondence(String chronic_correspondence) { this.chronic_correspondence = chronic_correspondence; }
	public void setInsomnia(int insomnia) { this.insomnia = insomnia; }
	public void setFrightened(int frightened) { this.frightened = frightened; }
	public void setDepression(int depression) { this.depression = depression; }
	public void setMental_remarks(String mental_remarks) { this.mental_remarks =  mental_remarks; }
	public void setSuicide(int suicide) { this.suicide = suicide; }
	public void setDehydration(int dehydration) { this.dehydration = dehydration; }
	public void setMalnutrition(int malnutrition) { this.malnutrition = malnutrition; }
	public void setUnbalanced_diet(int unbalanced_diet) { this.unbalanced_diet = unbalanced_diet; }
	public void setUnbalanced_remarks(String unbalanced_remarks) { this.unbalanced_remarks = unbalanced_remarks; }
	public void setScratch_point(String scratch_point) { this.scratch_point = scratch_point; }
	public void setScratch_number(int scratch_number) { this.scratch_number = scratch_number; }
	public void setScratch_size(int scratch_size) { this.scratch_size = scratch_size; }
	public void setScratch_colour(int scratch_colour) { this.scratch_colour = scratch_colour; }
	public void setScratch_remarks(String scratch_remarks) { this.scratch_remarks = scratch_remarks; }
	public void setHindrance(int hindrance) { this.hindrance = hindrance; }
	public void setPerson_remarks(String person_remarks) { this.person_remarks = person_remarks; }


}
