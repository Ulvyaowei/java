package card;

import java.util.Scanner;

public class Withdraw extends Amount{
	Customer c1 = new Customer();
	public Withdraw(String account,Amount amount){
		c1.setAccount(account);
		c1.setAmount(amount);
	}
 
 public void  Withdraw(){
		System.out.println("..............取款................");
		System.out.println("当前余额："+c1.getAmount().getCaptial());
		System.out.println("请输入要取出数目：");
		Scanner input=new Scanner(System.in);
		int h=input.nextInt();
		System.out.println("当前余额："+(c1.getAmount().getCaptial()-h));
		
 }
}
