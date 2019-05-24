package lap9;

public abstract class Book {
    String title;
    double price;
    
    public Book(String title ){
    	this.title=title;
    }
    
    public String gettitle(){
        return title;
    }
    
    public double getPrice(){
        return price;
    }
    
    public abstract void setPrice();
}
