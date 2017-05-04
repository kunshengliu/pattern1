package 行为型模式.观察者;

public class Client {
	public static void main(String[] args) {
		Watched watched = new WatchedImpl();
		Watcher w1 = new WatcherImpl();
		Watcher w2 = new WatcherImpl();
		Watcher w3 = new WatcherImpl();
		Watcher w4 = new WatcherImpl();
		watched.addWatcher(w1);
		watched.addWatcher(w2);
		watched.addWatcher(w3);
		watched.addWatcher(w4);
		watched.notifyWatchers("干活了");
		
		
		
	}
}
