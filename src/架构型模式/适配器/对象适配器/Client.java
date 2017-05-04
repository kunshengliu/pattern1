package 架构型模式.适配器.对象适配器;

public class Client {
	public static void main(String[] args) {
		Adaptee adaptee = new Adaptee();
		Target target = new Adapter(adaptee);
		target.handleRequest();
		
		
		
	}
}
