package concurrentPro;

import java.util.List;
import java.util.Vector;

public class EvenNum extends Thread {

	int m,n;
	List<Integer>evendata=new Vector<>();
   EvenNum(int x,int y, Vector<Integer>even1){
	   this.m=x;
	   this.n=y;
	   evendata=even1;
		
	}
	public void run() {
		
		for(int num=m; num<=n; num++) {
			if(num%2==0) {
				evendata.add(num);	
			}
				
			     			
		}
	}
}
