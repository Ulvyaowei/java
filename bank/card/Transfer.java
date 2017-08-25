package card;

import java.util.Scanner;



public class Transfer  {
    Customer c1 = new Customer();
	
	public Transfer(String account,Amount amount){
		c1.setAccount(account);
		c1.setAmount(amount);
	}
	
	
	public double  Transfer(){
		System.out.println("..............转账................");
		System.out.println("当前余额："+c1.getAmount().getCaptial());
		System.out.println("请输入要转入的账户：");
		Scanner input=new Scanner(System.in);
		String g=input.next();
		System.out.println("请输入要转入的数目：");
		double  h=input.nextInt();
		double sum =c1.getAmount().getCaptial()-h;
		System.out.println("当前余额："+(c1.getAmount().getCaptial()-h));
		return sum;
		
	}
	
	
	
}
