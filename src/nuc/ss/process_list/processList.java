package nuc.ss.process_list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import nuc.ss.entity.Process;

public class processList {
	public List<Process> input(){
		List<Process> listP = new ArrayList<Process>();
		Scanner sc = new Scanner(System.in);
		System.out.println("��������̸�����");
		int len = sc.nextInt();
		int i = 0;
		while(i<len) {
			System.out.println("��������̵Ľ���ʱ�̣�");
			int start_time = sc.nextInt();
			System.out.println("��������̵�����ʱ�䣺");
			int run_time = sc.nextInt();
			Process pc = new Process(start_time,run_time);
			listP.add(pc);
			i++;
		}
		sc.close();
		return listP;
	}
}
