package ��Ϊ��ģʽ.������;
/**
 * ������
 * @author liukunsheng
 *
 */
public abstract class Leader {
	protected String name;
	protected Leader nextLeader;
	public Leader(String name) {
		super();
		this.name = name;
	}
	public void setNextLeader(Leader nextLeader){
		this.nextLeader=nextLeader;
	}
	/**
	 * ��������ĺ��ķ���
	 * @param requst
	 */
	public abstract void handleRequset(LeaveRequset requst);
}
