package ��Ϊ��ģʽ.�۲���;
/**
 * ���۲���
 * 
 * @author liukunsheng
 *
 */
public interface Watched {
	void addWatcher(Watcher  watcher);
	void removeWatcher(Watcher watcher);
	void notifyWatchers(String str);
}
