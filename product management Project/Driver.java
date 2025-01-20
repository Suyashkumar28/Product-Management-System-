import java.util.Scanner;
class Driver{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Shirt[] s=new Shirt[4];
		s[0]=new Shirt(40, "Red", "Levis", 1500);
		s[1]=new Shirt(42, "Black", "BlackBerry", 1800);
		s[2]=new Shirt(40, "white", "BlackBerry", 2300);
		s[3]=new Shirt(38, "Red", "Peter england", 1300);
		System.out.println("=====All Shirts are Below=====");
		for(int i=0;i<s.length;i++){
			System.out.println(s[i].displayDetails());
		}
		System.out.println("=====All Shirts of Size 40 are Below=====");
		for(int i=0;i<s.length;i++){
			if(s[i].size==40)
				System.out.println(s[i].displayDetails());
		}
		System.out.println("=====All Shirts of Size 40 and brand BlackBerry  are Below=====");
		for(int i=0;i<s.length;i++){
			if(s[i].size==40 && s[i].brand.equalsIgnoreCase("blackberry"))
				System.out.println(s[i].displayDetails());
		}


		System.out.println("======Program Ends======");
	}
}




