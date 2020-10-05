package nuc.ss.process_running;

import java.util.List;

import nuc.ss.process_list.processList;
import nuc.ss.entity.Process;

public class processRunning {
	private processList pl = new processList();
	List<Process> listP = pl.input();
	
	public void runing() {
		for(int i=0;i<listP.size();i++) {
			if(i == 0) {
				listP.get(i).setStart_time(listP.get(i).getArrive_time());
				listP.get(i).setEnd_time(listP.get(i).getStart_time()+listP.get(i).getRun_time());
				listP.get(i).setTurnover_time(listP.get(i).getEnd_time()-listP.get(i).getArrive_time());
				listP.get(i).setWturnover_time((double)(Math.round(listP.get(i).getTurnover_time()/listP.get(i).getRun_time())/100.0));
			}else {
				listP.get(i).setStart_time(listP.get(i-1).getEnd_time());
				listP.get(i).setEnd_time(listP.get(i).getStart_time()+listP.get(i).getRun_time());
				listP.get(i).setTurnover_time(listP.get(i).getEnd_time()-listP.get(i).getArrive_time());
				listP.get(i).setWturnover_time((double)(Math.round(listP.get(i).getTurnover_time()/listP.get(i).getRun_time())/100.0));	
			}
			
		}
	}
	
	public void show() {
		for(int i=0;i<listP.size();i++) {
			System.out.println(listP.get(i).toString());
		}
	}
}
