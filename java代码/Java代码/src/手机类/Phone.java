package �ֻ���;

public class Phone {
private String brand;
private int price;
private String color;
public String getbrand(){
	return brand;
}
public String getcolor() {
	return color;
}
public int getprice() {
	return price;
}
public void setbrand(String brand) {
	this.brand=brand;
}
public void setcolor(String color) {
	this.color=color;
}
public int setprice(int price) {
	return this.price=price;
}
public void read() {
	System.out.println(brand+"---"+price+"---"+color);
}
}
