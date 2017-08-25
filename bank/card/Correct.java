package card;

import java.util.Scanner;



public class Correct extends Person{
	 Customer c1 = new Customer();
	public Correct(){
		
	}
	
	
	
	public void correct(){
		System.out.println("请输入您要修改的名字");
		Scanner s1 = new Scanner(System.in);
		String n1 = s1.next();
		if(n1.equals(this.getName())){
			System.out.println("输入错误");
		}else{
			System.out.println("修改后的名字是"+n1);
		}
	
	}
	
	
}
