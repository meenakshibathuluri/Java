public class BookObject {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.setName("meenakshi");
        b1.setPrice(300);
        b1.setPages(150);
        b1.setAuthor("Robert");
        System.out.println(b1.getName());
        System.out.println(b1.getPrice());
        System.out.println(b1.getPages());
        System.out.println(b1.getAuthor());
    }
}
