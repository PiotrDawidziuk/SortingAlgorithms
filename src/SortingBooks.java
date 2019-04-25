public class SortingBooks {

    void sortingBooks(Book arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j].getTitle().compareTo(arr[j+1].getTitle())>0)
                {
                    // swap arr[j+1] and arr[i]
                    Book temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }


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

        for (Book book : books){
            System.out.println(book.toString());
        }

        System.out.println("--------------------");

        SortingBooks sortingBooks = new SortingBooks();
        sortingBooks.sortingBooks(books);

        for (Book book : books){
            System.out.println(book.toString());
        }
    }

}
