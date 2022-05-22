import java.util.ArrayList;
import java.util.Scanner;

public class BookApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Book> books = new ArrayList<>();

        books.add(new Book("Sledgehammer's Inappropriate Guide to Programming", 69, 2025));
        books.add(new Book("Drewbacca's Essential Overachievement Primer", 1000, 2022));
        books.add(new Book("A Brief Time of History", 420, 1969));

        System.out.println("What information would you like printed? Everything or just names");
        String res2 = in.nextLine();
        if (res2.equalsIgnoreCase("everything")) {
            for (Book book : books) {
                System.out.println(book);
            }
        } else {
            for (Book book : books) {
                System.out.println(book.getTitle());
            }
        }

        in.close();
    }
}
