import java.util.Scanner;
class Book{
    private int bookid, price;
    private String title, author;
    
    /*public Book(){}*/
        public void getdetails(){
            Scanner in=new Scanner(System.in);
            System.out.println("Enter Book ID: ");
            bookid=in.nextInt();
            System.out.println("Enter Title: ");
            title=in.next();
            System.out.println("Enter Author: ");
            author=in.next();
            System.out.println("Enter book price: ");
            price=in.nextInt();
        }
        public void printdetails(){
            System.out.println("Book Id: "+bookid);
            System.out.println("Book title: "+title);
            System.out.println("Book author: "+author);
            System.out.println("Book price: "+price);
        }
    
}

public class Bookdemo{
    public static void main(String[] args) {
        Book obj1=new Book();
        Book obj2=new Book();
        obj1.getdetails();
        System.out.println();
        obj1.printdetails();
        System.out.println();
        obj2.getdetails();
        System.out.println();
        obj2.printdetails();
        System.out.println();
    }
}