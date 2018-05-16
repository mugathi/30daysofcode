class MyBook extends Book
{
    int price;
    MyBook(String t,String a,int p)
    {
        super(t,a);
        price=p;
    }
    // Declare the price instance variable
    
    /**   
    *   Class Constructor
    *   
    *   @param title The book's title.
    *   @param author The book's author.
    *   @param price The book's price.
    **/
    // Write your constructor here
    
void display()
{
 System.out.println("Title: "+title+"\nAuthor: "+author+"\nPrice: "+price);   
}
    /**   
    *   Method Name: display
    *   
    *   Print the title, author, and price in the specified format.
    **/
    // Write your method here
    
// End class
}