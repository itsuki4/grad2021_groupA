package model;

import java.io.Serializable;

public class Others_date implements Serializable {

	private int person_id; //児童ID
	private String provider_name; //氏名
	private String provider_name2; //氏名(カタカナ)
	private int shelter_address1; //郵便番号
	private String shelter_address2; //都道府県
	private String shelter_address3; //市町村
	private String shelter_address4; //市町村(カタカナ)
	private int source; 				 //情報源
	private String provider_relationship; //児童との関係
	private String notification;			 //通告経緯
	private int cooperation;				 //調査協力
	private int contact;					 //連絡許可
	private int contents;				 //提供内容
	private String provider_remarks;	 //備考欄
	private int page_no;					 //記録番号

	public Others_date (
			int person_id, String provider_name, String provider_name2,
			int shelter_address1, String shelter_address2, String shelter_address3,
			String shelter_address4, int source, String provider_relationship,
			String notification, int cooperation, int contact, int contents,
			String provider_remarks, int page_no)
	{
		this.person_id = person_id;
		this.provider_name = provider_name;
		this.provider_name2 = provider_name2;
		this.shelter_address1 = shelter_address1;
		this.shelter_address2 = shelter_address2;
		this.shelter_address3 = shelter_address3;
		this.shelter_address4 = shelter_address4;
		this.source = source;
		this.provider_relationship= provider_relationship;
		this.notification = notification;
		this.cooperation = cooperation;
		this.contact = contact;
		this.contents = contents;
		this.provider_remarks = provider_remarks;
		this.page_no = page_no;
	}

	public int getPerson_id() { return person_id; }
	public String getProvider_name() { return provider_name; }
	public String getProvider_name2() { return provider_name2; }
	public int getShelter_address1() { return shelter_address1; }
	public String getShelter_address2() { return shelter_address2; }
	public String getShelter_address3() { return shelter_address3; }
	public String getShelter_address4() { return shelter_address4; }
	public int getSource() { return source; }
	public String getProvider_relationship() { return provider_relationship; }
	public String getNotification() { return notification; }
	public int getCooperation() { return cooperation; }
	public int getContact() { return contact; }
	public int getContents() { return contents; }
	public String getProvider_remarks() { return provider_remarks; }
	public int getPage_no() { return page_no; }

}