package rmuti.test;
import java.util.ArrayList;

public class App 
{
    public static void main( String[] args )
    {
    	ArrayList<Object> lst = new ArrayList(1);
    	lst.add(0,1);
    	lst.add(1,2);
    	lst.add(2,3);
    	lst.add(3,4);
    	
    	for(int i=0 ; i<lst.size(); i++){
    		if((Integer)lst.get(i)%2 != 0){
    			lst.remove(i);
    		}
    	}
        System.out.println(lst.toString());
    }
}
