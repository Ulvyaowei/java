package card;

import java.util.Scanner;



public class Transfer  {
    Customer c1 = new Customer();
	
	public Transfer(String account,Amount amount){
		c1.setAccount(account);
		c1.setAmount(amount);
	}
	
	
	public double  Transfer(){
		System.out.println("..............ת��................");
		System.out.println("��ǰ��"+c1.getAmount().getCaptial());
		System.out.println("������Ҫת����˻���");
		Scanner input=new Scanner(System.in);
		String g=input.next();
		System.out.println("������Ҫת�����Ŀ��");
		double  h=input.nextInt();
		double sum =c1.getAmount().getCaptial()-h;
		System.out.println("��ǰ��"+(c1.getAmount().getCaptial()-h));
		return sum;
		
	}
	
	
	
}
