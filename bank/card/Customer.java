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
		System.out.println("请输入您的账号");
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		System.out.println("请输入您的密码");
		Scanner sb = new Scanner(System.in);
		String s2 = sb .next();
	if (this.account.equals(s1)  && this.password.equals(s2)) {
		System.out.println("登陆成功");
		break;
	}else if(q != 0 ){
		System.out.println("登录失败");
		q--;
		continue;
	}	else  {
		System.err.println("..............已输错3次，系统退出................");
		System.err.println("..............再见................");
		System.exit(0);
	}
	
	}
}

public void circu(){
	 System.out.println("选择接下来的功能 1.修改个人信息 2.转账 3.存款 4.取款 0.退出");
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
	System.out.println("确定？Y/N");
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

