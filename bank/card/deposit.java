package card;

import java.util.Scanner;

public class deposit extends Amount{
	Customer c1 = new Customer();
	public deposit(String account,Amount amount){
		c1.setAccount(account);
		c1.setAmount(amount);
	}
	
	public void save(){
		System.out.println("..............存款................");
		System.out.println("当前余额："+c1.getAmount().getCaptial());
		System.out.println("请输入要存入数目：");
		Scanner input=new Scanner(System.in);
		int h=input.nextInt();
		double sum = (c1.getAmount().getCaptial()+h);
		System.out.println("当前余额："+sum);
		c1.circu();
	}
}
