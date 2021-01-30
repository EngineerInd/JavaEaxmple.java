import java.util.ArrayList;
public class JavaExample {
   public static void main(String[] args) {
      ArrayList<String> names = new ArrayList<String>();
      names.add("LUMBHA");
      names.add("RAHUL");
      names.add("JATIN");
      names.add("ARVIND");
      names.set(0, "RAMESH");
      System.out.println(names);
   }
}
