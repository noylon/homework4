package homework4;
import java.util.*;

public class GuGuDan {
	int quitFlag, dandangu;	//exit state, what gugudan to be shown
	
	void init() {
		do {
			if((this.quitFlag = this.input()) == 0)	//in case of loop
				this.print();
		} while(this.quitFlag == 0); //loop if not in exit state
		
		System.out.println("\n ���α׷�4�� �����մϴ�. \n");
	}
	int input() {
		Scanner s = new Scanner(System.in);
		System.out.print("����ϰ� ���� ��(Q:����) >> ");
		
		if(s.hasNextInt())
			this.dandangu = s.nextInt();
		else if(s.next().equals("Q"))
			return 1;
		
		return 0;
	}
	void print() {
		if(dandangu > 1 && dandangu <10) {
			for(int i=1;i<10;i++) {
				System.out.format(" %d * %d  = %2d    ", this.dandangu, i, this.dandangu*i);
				if(i % 2 == 0 || i == 9)
					System.out.print("\n");
			}
		}
		else
			System.out.println(" ==> �߸��Է�");
	}
}