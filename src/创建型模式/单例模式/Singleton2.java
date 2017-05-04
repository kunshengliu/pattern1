package ������ģʽ.����ģʽ;
/**
 * ˫�ؼ����
 * @author liukunsheng
 *
 */
public class Singleton2 {
	private static volatile Singleton2 singleton2;
	private Singleton2(){}
	
	public static Singleton2 getIntence(){
		if(singleton2==null){
			synchronized (Singleton2.class) {
				if(singleton2==null){
					return new Singleton2();
				}
			}
		}
		return singleton2;
		
	}
	
	
	
}
