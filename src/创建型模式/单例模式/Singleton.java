package ������ģʽ.����ģʽ;
/**
 * ����ģʽ
 * @author liukunsheng
 *
 */
public class Singleton {
	private static Singleton singleton;
	private  Singleton() {}
	public synchronized static Singleton getIntence(){
		if(singleton==null){
			return new Singleton();
		}
		return singleton;
		
	}
	
}
