package 创建型模式.单例模式;

import java.io.Serializable;

/**
 *
 * 静态内部类模式
 * 
 * @author liukunsheng
 *
 **/
public class Singleton3{
	private Singleton3(){
		
		
	}
	private static class SingletonClassInstance{
		private static final Singleton3 instance = new Singleton3();
	}
	public static Singleton3 getInstance(){
		return SingletonClassInstance.instance;
	}
}
