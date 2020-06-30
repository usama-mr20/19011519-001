package edu.uog.teacher;

import edu.uog.person.Person;

public class Teacher extends Person {



	private int TEACHER_ID;
	private String TEACHER_NAME;
	private String TITLE;
	private int PERSON_ID;

	public int getTEACHER_ID() {
		return TEACHER_ID;
	}
	public void setTEACHER_ID(int tEACHER_ID) {
		TEACHER_ID = tEACHER_ID;
	}
	public String getTEACHER_NAME() {
		return TEACHER_NAME;
	}
	public void setTEACHER_NAME(String tEACHER_NAME) {
		TEACHER_NAME = tEACHER_NAME;
	}
	public String getTITLE() {
		return TITLE;
	}
	public void setTITLE(String tITLE) {
		TITLE = tITLE;
	}
	public int getPERSON_ID() {
		return PERSON_ID;
	}
	public void setPERSON_ID(int pERSON_ID) {
		PERSON_ID = pERSON_ID;
	}




	public String toString() {
		String str = null;

		str = this.getTEACHER_ID()
				+ "," + this.getTEACHER_NAME()
				+ "," + this.getTITLE()
				+ "," + this.getPERSON_ID()
				+ "," + this.getGENDER()
				+ "," + this.getADDRESS();




		return str;
	}
}
