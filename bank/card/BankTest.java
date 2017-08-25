package card;



public class BankTest {
public static void main(String[] args) {
	System.out.println("-----------------------bank----------------------");
	Person p1 = new Person("tom","vally","13803214567",25);
	Person p2 = new Person("jack","vally","13803214567",25);
	Amount a1 = new Amount(2000,0.5);
	System.out.println(a1.getCaptial());
	Amount a2 = new Amount(2000,0.5);
	Customer c1 = new Customer("1234","222",a1);
	Customer c2 = new Customer("1111","1111",a2);
	c1.login();
	c1.circu();
	
}
}
