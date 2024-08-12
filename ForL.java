import java.util.ArrayList;
import java.util.Iterator;

public class ForL{
public static void main(String[]args){
// prepare an object for ArrayList
  // Load String instead of Integers 
  // Iterate them using for each loop
  ArrayList<String> array = new ArrayList<>();
    array.add("Karthik");
    array.add("Sai");
    array.add("Fayaz");    
    for(String names:array){
      System.out.println(names);
    }
}
}
