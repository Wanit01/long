package rmuti.test;
import java.util.ArrayList;

public class Fine {

	ArrayList<Object> lst = new ArrayList(1);;
	public Fine() {
		lst.add(0,6);
		lst.add(1,7);
		lst.add(2,8);
	}
	public int fine(Object o){
		for (int i = 0 ; i<lst.size(); i++){
			if(lst.get(i) == o){
				return i;
			}
		}
		
		return 0;
		
	}
	public static void main(String[]args){
		Fine f = new Fine();
		System.out.println(f.fine(7));
		
	}

}