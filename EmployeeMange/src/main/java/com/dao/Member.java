package com.dao;

public class Member {
	
	
	private static String Emp_id;
	private static String first_name;
	private static String last_name;
	private static String DOB;
	private static String Gender;
	private static String Jooining_Date;
	private static String Email;
	private static String Official_email;
	private	static String Designation,Address,city,State,Country,Pin_code;
	private static String Phone_no;
	private static String Mobile_no;
	private static String Area_of_work;
	private static String Secret_question;
	private static String Secret_Answer;
	private static String Username;
	private static String Password;

	public Member() {
		
	}

	Member(String Emp_id,String first_name, String last_name, String dOB, String gender, String jooining_Date, String email,
			String official_email, String designation, String address, String city, String state, String country,
			String pin_code, String phone_no, String mobile_no, String area_of_work, String secret_question,
			String secret_Answer, String username, String password) {
		this.Emp_id=Emp_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.DOB = dOB;
		this.Gender = gender;
		this.Jooining_Date = jooining_Date;
		this.Email = email;
		this.Official_email = official_email;
		this.Designation = designation;
		this.Address = address;
		this.city = city;
		this.State = state;
		this.Country = country;
		this.Pin_code = pin_code;
		this.Phone_no = phone_no;
		this.Mobile_no = mobile_no;
		this.Area_of_work = area_of_work;
		this.Secret_question = secret_question;
		this.Secret_Answer = secret_Answer;
		this.Username = username;
		this.Password = password;
	}

	public static String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public static String getEmp_id() {
		return Emp_id;
	}

	public void setEmp_id(String emp_id) {
		Emp_id = emp_id;
	}

	public static String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public static String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}

	public static String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public static String getJooining_Date() {
		return Jooining_Date;
	}

	public void setJooining_Date(String jooining_Date) {
		Jooining_Date = jooining_Date;
	}

	public static String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public static String getOfficial_email() {
		return Official_email;
	}

	public void setOfficial_email(String official_email) {
		Official_email = official_email;
	}

	public static String getDesignation() {
		return Designation;
	}

	public void setDesignation(String designation) {
		Designation = designation;
	}

	public static String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public static String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public static String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public static String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public static String getPin_code() {
		return Pin_code;
	}

	public void setPin_code(String pin_code) {
		Pin_code = pin_code;
	}

	public static String getPhone_no() {
		return Phone_no;
	}

	public void setPhone_no(String phone_no) {
		Phone_no = phone_no;
	}

	public static String getMobile_no() {
		return Mobile_no;
	}

	public void setMobile_no(String mobile_no) {
		Mobile_no = mobile_no;
	}

	public static String getArea_of_work() {
		return Area_of_work;
	}

	public void setArea_of_work(String area_of_work) {
		Area_of_work = area_of_work;
	}

	public static String getSecret_question() {
		return Secret_question;
	}

	public void setSecret_question(String secret_question) {
		Secret_question = secret_question;
	}

	public static String getSecret_Answer() {
		return Secret_Answer;
	}

	public void setSecret_Answer(String secret_Answer) {
		Secret_Answer = secret_Answer;
	}

	public static String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public static String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}
	

	
	}


