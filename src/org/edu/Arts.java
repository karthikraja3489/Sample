package org.edu;

public class Arts extends Education {
	public void bSc() {
		System.out.println("Course Name is B.Sc");
	}
	public void bEd() {
		System.out.println("Course Name is B.Ed");
	}
	public void bA() {
		System.out.println("Course Name is B.A");
	}
	public void bBA() {
		System.out.println("Course Name is BBA");
	}
	public void ug() {
		System.out.println("UG courses:ECE,EEE");
	}
	public void pg() {
		System.out.println("PG courses:M.E.M.Tech");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Arts a=new Arts();
a.bSc();
a.bEd();
a.bA();
a.bBA();
a.ug();
a.pg();
	}

}
