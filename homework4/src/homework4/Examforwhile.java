package homework4;
import java.util.*;

public class Examforwhile {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int selectedModule;
		
		do {
			System.out.println("1. 1���� �Է��� ������ ���ϱ�");
			System.out.println("2. �ִ밪/�ּҰ����ϱ�");
			System.out.println("3. �Է¹��������� �հ�� ��ձ��ϱ�");
			System.out.println("4. ���ϴ� ������ ����ϱ� ");
			System.out.println("5. ¦����/Ȧ���� ����ϱ�");
			System.out.println("6. �����ϱ�");
			System.out.print("���ϴ� �޴���>> "); 
			selectedModule = s.nextInt();
			
			if(selectedModule == 1)
				new SumofNumbers().init();
			else if(selectedModule == 2)
				new MaxAndMin().init();
			else if(selectedModule == 3)
				new SumAndAvg().init();
			else if(selectedModule == 4)
				new GuGuDan().init();
			else if(selectedModule == 5)
				new GuGuDan2().init();
			
		} while(selectedModule != 6);
		
		System.out.println("�ý����� ����˴ϴ�.");
	}
}