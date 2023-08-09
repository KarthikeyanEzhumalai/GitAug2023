package org.com;

import java.util.LinkedList;
import java.util.List;

public class index5 {
	public static void main(String[] args) {

		List<Integer> li = new LinkedList<>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(90);
		li.add(10);
		li.add(10);
		li.add(40);
		li.add(50);
		li.add(10);
		
		// To get the each index value of 10th()
		for(int i=0;i<li.size();i++)
		{
			Integer in1 = li.get(i);
			//System.out.println(in1);
			
		
		if(in1==10)
		{
			System.out.println(i);
		}
				
		}
		
		// Execution Part();
/* i=0;   i<9;  10  10==10  0
 * i=1    1<9   20  20==10  
 * i=2    2<9   30  30==10 
 * i=3    3<9   90   90==10 
 * i=4    4<9   10   10== 10 4
 * i=5    5<9   10   10==10  5
 * i=6    6<9   40   40==10   
 * i=7    7<9   50   50==10
 * i=8    8<9   10   10==10   8
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */
	}

}
