import java.util.ArrayList;
import java.util.Iterator;

public class ForL{
public static void main(String[]args){
  ArrayList<String> array = new ArrayList<>();
    array.add("Karthik");
    array.add("Sai");
    array.add("Fayaz");    
    for(String names:array){
      System.out.println(names);
    }
}
}
