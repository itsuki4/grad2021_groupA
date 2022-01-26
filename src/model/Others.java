package model;

public class Others {

	private int person_id; //児童ID
	private String provider_name; //氏名
	private String provider_relationship; //児童との関係

	public Others() {};

	public Others(int person_id, String provider_name, String provider_relationship) {
		this.person_id = person_id;
		this.provider_name = provider_name;
		this.provider_relationship = provider_relationship;
	}

	public int getPerson_id() {
		return person_id;
	}

	public String getProvider_name() {
		return provider_name;
	}

	public String getProvider_relationship() {
		return provider_relationship;
	}

}
