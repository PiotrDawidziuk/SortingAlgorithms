public class SortingBooks {

    public static void main(String[] args) {

        Book book1= new Book("A Book","An Author",30);
        Book book2= new Book("C Book","C. Author",20);
        Book book3= new Book("D Book","D. Writer",10);
        Book book4= new Book("B Book","B. Poet",20);
        Book book5= new Book("E Book","Ellen Author",30);
        System.out.println(book1.toString());

        int comp1to2 = book1.getTitle().compareTo(book2.getTitle());
        System.out.println(comp1to2);

        Book[] books = {book1,book2,book3,book4,book5};

        System.out.println();

    }

}
