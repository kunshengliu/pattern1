package 架构型模式.适配器.对象适配器;
/**
 * 真正是适配器
 * @author liukunsheng
 *
 */
public class Adapter implements Target{
	private Adaptee adaptee;//被适配的对象
	public Adapter(Adaptee adaptee) {
		this.adaptee =adaptee;
	}
	
	@Override
	public void handleRequest() {
		adaptee.handle();
	}
}
