package task3;

public class Task3 {
    public static void main(String[] args) {
        Book book1 = new Book("Name1", "Author1", 1958);
        Book book2 = new Book("Name2", "Author2", 2022);

        Books books1 = () -> System.out.println(book1);
        books1.show();

        Books books = new Books() {
            @Override
            public void show() {
                System.out.println(book2);
            }
        };
    }


}
