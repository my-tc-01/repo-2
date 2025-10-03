/*

To Generate the multiplication table for the given number

*/

class MulTable {
	int n;
	void set(int x){
		n = x;
	}
	void table () {
		for (int i = 1;i<=10;i++) {
			int res = n*i;
			System.out.println(n+"x"+i+"="+res);
		}
	
	}
}
class MulDemo {
	public static void main(String[] args) {
		MulTable m = new MulTable();
		m.set(5);
		m.table();
	
	}
}