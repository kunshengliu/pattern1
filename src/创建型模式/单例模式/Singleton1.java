package ������ģʽ.����ģʽ;
/**
 * ����ģʽ
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
