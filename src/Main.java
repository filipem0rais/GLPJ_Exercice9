public class Main {
    public static void main(String[] args) {
        CD cd1 = new CD("The Dark Side of the Moon", "Pink Floyd", 10, 42);
        //DVD dvd1 = new DVD("The Matrix", "Andy Wachowski", 136);
        Database db = new Database();
        db.addItem(cd1);
        //db.addItem(dvd1);
        db.list();

    }
}