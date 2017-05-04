package 架构型模式.适配器.类适配器;

public class Client {
	public static void main(String[] args) {
		Target target = new Adapter();
		target.handleReq();
	}
}
