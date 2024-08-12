import java.util.ListIterator;
import java.util.ArrayList;

public class Dynamic {
  public static void main(String[] args) {    
      ArrayList<Person> list = new ArrayList<>();
      list.add(new Person("Karthik", 21));
      list.add(new Person("Sai", 20));

      ListIterator<Person> listIterator = list.listIterator();
      while (listIterator.hasNext()) {
          Person person = listIterator.next();
          System.out.println("Person Name: "+person.getName() + " Age: "+person.getAge());
      }
  }
}

class Person {
  private String name;
  private int age;

  public Person(String name, int age) { 
      this.name = name;
      this.age = age;
  }

  public String getName() {
      return name;
  }

  public int getAge() {
      return age;
  }
}