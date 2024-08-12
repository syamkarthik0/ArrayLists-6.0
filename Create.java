import java.util.ArrayList;
import java.util.Iterator;

public class Create{
public static void main(String[]args){
    ArrayList<Integer> array = new ArrayList<>();
    array.add(10);
    array.add(30);
    array.add(20);    
    Iterator<Integer> iterator = array.iterator();
    while(iterator.hasNext()){
      System.out.println(iterator.next());
    }
  }
}

