package ������ģʽ.����ģʽ;

import java.io.Serializable;

/**
 *
 * ��̬�ڲ���ģʽ
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
