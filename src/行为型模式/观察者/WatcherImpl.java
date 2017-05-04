package 行为型模式.观察者;

public class WatcherImpl  implements Watcher{

	@Override
	public void update(String str) {
		System.out.println(str);
	}

}
