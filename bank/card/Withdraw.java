package card;

import java.util.Scanner;

public class Withdraw extends Amount{
	Customer c1 = new Customer();
	public Withdraw(String account,Amount amount){
		c1.setAccount(account);
		c1.setAmount(amount);
	}
 
 public void  Withdraw(){
		System.out.println("..............ȡ��................");
		System.out.println("��ǰ��"+c1.getAmount().getCaptial());
		System.out.println("������Ҫȡ����Ŀ��");
		Scanner input=new Scanner(System.in);
		int h=input.nextInt();
		System.out.println("��ǰ��"+(c1.getAmount().getCaptial()-h));
		
 }
}
