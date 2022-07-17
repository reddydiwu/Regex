package farmers;
import java.util.Scanner;
public class Farmer {
private String name;
private String age;
private String state;
private String phone;
public Farmer(String name, String age, String state, String phone) {
	
	this.name = name;
	this.age = age;
	this.state = state;
	this.phone = phone;
}
public Farmer() {
}
public String getName() {
	return name;
}
public void setName() {
	System.out.println("Input Farmer's name");
	Scanner sc = new Scanner(System.in);
	this.name = sc.nextLine();
	//sc.close();
}
public String getAge() {
	return age;
}
@SuppressWarnings("resource")
public void setAge() {
	System.out.println("Input Farmer's Age");
	Scanner sc = new Scanner(System.in);
	this.age = sc.nextLine();
	//sc.close();
}
public String getState() {
	return state;
}
public void setState() {
	System.out.println("Input Farmer's State");
	Scanner sc = new Scanner(System.in);
	this.state = sc.nextLine();
	//sc.close();
}
public String getPhone() {
	return phone;
}
public void setPhone() {
	System.out.println("Input Farmer's Phone Number");
	Scanner sc = new Scanner(System.in);
	this.phone = sc.nextLine();
	//sc.close();
}
}
