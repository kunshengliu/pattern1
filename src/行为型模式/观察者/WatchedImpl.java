package 行为型模式.观察者;

import java.util.ArrayList;
import java.util.List;

public class WatchedImpl  implements  Watched{
	private  List<Watcher> list  = new ArrayList<Watcher>();
	@Override
	public void addWatcher(Watcher watcher) {
		list.add(watcher);
	}

	@Override
	public void removeWatcher(Watcher watcher) {
		list.remove(watcher);
	}

	@Override
	public void notifyWatchers(String str) {
		for(Watcher watcher :list){
			watcher.update(str);
		}
		
	}
}
