package card;

import java.util.Scanner;



public class Correct extends Person{
	 Customer c1 = new Customer();
	public Correct(){
		
	}
	
	
	
	public void correct(){
		System.out.println("��������Ҫ�޸ĵ�����");
		Scanner s1 = new Scanner(System.in);
		String n1 = s1.next();
		if(n1.equals(this.getName())){
			System.out.println("�������");
		}else{
			System.out.println("�޸ĺ��������"+n1);
		}
	
	}
	
	
}
