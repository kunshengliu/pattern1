package 行为型模式.观察者;
/**
 * 被观察者
 * 
 * @author liukunsheng
 *
 */
public interface Watched {
	void addWatcher(Watcher  watcher);
	void removeWatcher(Watcher watcher);
	void notifyWatchers(String str);
}
