package 创建型模式.单例模式;
/**
 * 懒汉模式
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
