package 行为型模式.责任链;

public class Manager  extends Leader{

	public Manager(String name) {
		super(name);
	}

	@Override
	public void handleRequset(LeaveRequset requst) {
		if(requst.getLeaveDays()>3){
			System.out.println(requst.getEmpName()+":"+requst.getLeaveDays());
		}else{
			if(this.nextLeader!=null){
				this.nextLeader.handleRequset(requst);
			}
		}
	}

}
