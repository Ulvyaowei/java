package card;

public class Amount {
protected double captial;
protected double rate;


public Amount(){
}
public Amount(double captial,double rate){
	this.captial = captial;
	this.rate = rate;
}

public double getCaptial() {
	return captial;
}
public void setCaptial(double captial) {
	this.captial = captial;
}
public double getRate() {
	return rate;
}
public void setRate(double rate) {
	this.rate = rate;
}

@Override
public String toString() {
	return "Amount [captial=" + captial + ", rate=" + rate + "]";
}



}
