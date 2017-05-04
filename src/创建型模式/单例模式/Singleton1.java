package 创建型模式.单例模式;
/**
 * 饿汉模式
 * @author liukunsheng
 *
 */
public class Singleton1 {
	private Singleton1(){};
	private static Singleton1 singleton1 = new Singleton1();
	public static Singleton1 getIntence(){
		return singleton1;
	}
	
	
	
}
