package nuc.ss.entity;

public class Process {
	private int arrive_time;
	private int run_time;
	private int start_time;
	private int end_time;
	private int turnover_time;
	private double Wturnover_time;
	
	
	
	public Process(int arrive_time, int run_time) {
		super();
		this.arrive_time = arrive_time;
		this.run_time = run_time;
	}
	public int getArrive_time() {
		return arrive_time;
	}
	public void setArrive_time(int arrive_time) {
		this.arrive_time = arrive_time;
	}
	public int getRun_time() {
		return run_time;
	}
	public void setRun_time(int run_time) {
		this.run_time = run_time;
	}
	public int getStart_time() {
		return start_time;
	}
	public void setStart_time(int start_time) {
		this.start_time = start_time;
	}
	public int getEnd_time() {
		return end_time;
	}
	public void setEnd_time(int end_time) {
		this.end_time = end_time;
	}
	public int getTurnover_time() {
		return turnover_time;
	}
	public void setTurnover_time(int turnover_time) {
		this.turnover_time = turnover_time;
	}
	public double getWturnover_time() {
		return Wturnover_time;
	}
	public void setWturnover_time(double wturnover_time) {
		Wturnover_time = wturnover_time;
	}
	@Override
	public String toString() {
		return "[����ʱ�̣�" + arrive_time + ", ����ʱ�䣺" + run_time + ", ��ʼʱ�̣�" + start_time
				+ ", ���ʱ�̣�" + end_time + ", ��תʱ�䣺" + turnover_time + ", ��Ȩ��תʱ�䣺" + Wturnover_time
				+ "]";
	}
}
