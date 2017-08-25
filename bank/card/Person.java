package card;


public class Person {
private String name;
private String addr;
private String tele;
private int age;


public Person(){
	
}

public Person(String name, String addr, String tele, int age) {
	super();
	this.name = name;
	this.addr = addr;
	this.tele = tele;
	this.age = age;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddr() {
	return addr;
}
public void setAddr(String addr) {
	this.addr = addr;
}
public String getTele() {
	return tele;
}
public void setTele(String tele) {
	this.tele = tele;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
@Override
public String toString() {
	return "PersonalMsg [name=" + name + ", addr=" + addr + ", tele=" + tele + ", age=" + age + "]";
}

}
