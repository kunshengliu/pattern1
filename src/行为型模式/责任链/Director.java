package ��Ϊ��ģʽ.������;

public class Director  extends Leader{

	public Director(String name) {
		super(name);
	}

	@Override
	public void handleRequset(LeaveRequset requst) {
		if(requst.getLeaveDays()<3){
			System.out.println(requst.getEmpName()+":"+requst.getLeaveDays()+":"+this.name+"��׼");
		}else{
			if(this.nextLeader!=null){
				this.nextLeader.handleRequset(requst);
			}
		}
	}

}
