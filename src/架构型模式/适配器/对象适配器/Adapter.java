package �ܹ���ģʽ.������.����������;
/**
 * ������������
 * @author liukunsheng
 *
 */
public class Adapter implements Target{
	private Adaptee adaptee;//������Ķ���
	public Adapter(Adaptee adaptee) {
		this.adaptee =adaptee;
	}
	
	@Override
	public void handleRequest() {
		adaptee.handle();
	}
}
