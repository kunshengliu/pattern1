package ��Ϊ��ģʽ.������;

public class Client {
	public static void main(String[] args) {
		Leader a =new Director("����");
		Leader b =new Manager("����");
		//��ϵ
		a.setNextLeader(b);
		//��ʼ���
		LeaveRequset re = new LeaveRequset("wo", 2, "˯��");
		a.handleRequset(re);
		
		
		
	}
}
