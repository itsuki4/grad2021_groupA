package model;

public class Health {
	private int person_id; //児童ID
	private String person_remarks; //児童の備考欄
	private String create_data; //記入日

	public Health() {};

	public Health(int person_id, String person_remarks, String create_data) {
		this.person_id = person_id;
		this.person_remarks = person_remarks;
		this.create_data = create_data;
	}

	public int getPerson_id() {
		return person_id;
	}

	public String getPerson_remarks() {
		return person_remarks;
	}

	public String getCreate_data() {
		return create_data;
	}
}
