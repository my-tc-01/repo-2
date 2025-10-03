/*
Assignment 1: Create an array object to store 5 students fee
print all 5 students for on console
*/
import java.util.Scanner;
class StudentData {
		int[] sno = {10,20,30,40,50};
		String[] sname = {"KVR","HK","NTJ","SRK","RK"};
		double[] sfee = {1000.00d,2000.00d,3000.00d,5000.00d,6000.00d};
		void displayStudent() {
			for (int i = 0;i<sno.length;i++) {
				System.out.printf("Studentid %d -> Sno: %d, Name: %s, Fee: %.2f%n",(i+1),sno[i],sname[i],sfee[i]);
			}
		}
	public static void main(String[] args) {
		StudentData st = new StudentData();
		st.displayStudent();
	}
}