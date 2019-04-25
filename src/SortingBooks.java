public class SortingBooks {

    void bubbleSort(Book arr[])
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

    void selectionSort(Book arr[])
    {
        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j].getTitle().compareTo(arr[min_idx].getTitle())<0)
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            Book temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    void insertionSort(Book arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            Book key = arr[i];
            int j = i - 1;

			/* Move elements of arr[0..i-1], that are
			greater than key, to one position ahead
			of their current position */
            while (j >= 0 && arr[j].getTitle().compareTo(key.getTitle()) >0) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
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
        //sortingBooks.bubbleSort(books);
        //sortingBooks.selectionSort(books);
        sortingBooks.insertionSort(books);
        for (Book book : books){
            System.out.println(book.toString());
        }
    }

}
