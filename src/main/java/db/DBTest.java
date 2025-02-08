package db;

public class DBTest {
    public static void main(String[] args) {
      String[] res = Queries.getCommandById("1");

      for (String string : res) {
         System.out.println(string);
        }
    }
}
