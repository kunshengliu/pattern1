package �ܹ���ģʽ.������.��������;

public class Client {
	public static void main(String[] args) {
		Target target = new Adapter();
		target.handleReq();
	}
}
