package card;

import java.util.Scanner;

public class deposit extends Amount{
	Customer c1 = new Customer();
	public deposit(String account,Amount amount){
		c1.setAccount(account);
		c1.setAmount(amount);
	}
	
	public void save(){
		System.out.println("..............���................");
		System.out.println("��ǰ��"+c1.getAmount().getCaptial());
		System.out.println("������Ҫ������Ŀ��");
		Scanner input=new Scanner(System.in);
		int h=input.nextInt();
		double sum = (c1.getAmount().getCaptial()+h);
		System.out.println("��ǰ��"+sum);
		c1.circu();
	}
}
