public class Main {
    public static void main(String[] args) {


            Table table = new Table();

            table.InsertColNames("name", "last_name");
            table.InsertRow("Israel", "Israeli");

            Srting name = Table.GetValue("name", 0);
            println(name);

        System.out.println("Hello world!");
    }
}