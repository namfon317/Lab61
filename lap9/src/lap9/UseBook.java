package lap9;

public class UseBook {
    
	   
    public static void main(String[] args){
        Book books;
        books=new Fiction("book1");
        System.out.println(books.gettitle());
        books=new NonFiction("book1");
        System.out.println(books);
        
        
    }
}
