package card;



import java.util.Scanner;

public class Customer {
private String account;
private String password;
private Amount amount;





public Customer(){
}


public Customer(String account, String password,Amount amount) {
	super();
	this.account = account;
	this.password = password;
	this.amount = amount;

}



public void login(){
	int q = 2;
	for(int i = 0;i<3;i++){
		System.out.println("�����������˺�");
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		System.out.println("��������������");
		Scanner sb = new Scanner(System.in);
		String s2 = sb .next();
	if (this.account.equals(s1)  && this.password.equals(s2)) {
		System.out.println("��½�ɹ�");
		break;
	}else if(q != 0 ){
		System.out.println("��¼ʧ��");
		q--;
		continue;
	}	else  {
		System.err.println("..............�����3�Σ�ϵͳ�˳�................");
		System.err.println("..............�ټ�................");
		System.exit(0);
	}
	
	}
}

public void circu(){
	 System.out.println("ѡ��������Ĺ��� 1.�޸ĸ�����Ϣ 2.ת�� 3.��� 4.ȡ�� 0.�˳�");
		Scanner sc1 = new Scanner(System.in);
		int s3 = sc1.nextInt();
		switch(s3){
		case 1:
			Correct c = new Correct();
			c.correct();
			circu();
			break;
		case 2:
			Transfer t = new Transfer(account, amount);
			t.Transfer();
			circu();
			break;
		case 3:	
			deposit d = new deposit(account, amount);
			d.save();
			circu();
			break;
		case 4: 
			Withdraw w = new Withdraw(account, amount);
			w.Withdraw();
			circu();
			break;
		case 0:
			cone();
			circu();
			break;
		}
}
public void cone(){
	System.out.println("ȷ����Y/N");
	Scanner s1 =new  Scanner(System.in);
	String sc = s1.next();
	if(sc.equals("N")){
		circu();
	}else{
		System.out.println("byebye");
	}
}


public String getAccount() {
	return account;
}


public void setAccount(String account) {
	this.account = account;
}


public String getPassword() {
	return password;
}


public void setPassword(String password) {
	this.password = password;
}


public Amount getAmount() {
	return amount;
}


public void setAmount(Amount amount) {
	this.amount = amount;
}

	
}

