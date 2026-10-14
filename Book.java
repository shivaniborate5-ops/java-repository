package Assignment1;
public class Book {
    int bookId;
    String bookName;
    double price;
    Book(int bookId,String bookName,double price) {
        this.bookId=bookId;
        this.bookName=bookName;
        this.price=price;
    }
    void display() {
        System.out.println(bookId +"\t"+bookName+"\t"+price);
    }
    public static void main(String[] args) {
        Book[]b=new Book[5];
        b[0]=new Book(1,"Java",300);
        b[1]=new Book(2,"Python",350);
        b[2]=new Book(3,"C++",250);
        b[3]=new Book(4,"DBMS",400);
        b[4]=new Book(5,"Networking",450);
        System.out.println("Book ID\tBook Name\tPrice");
        for (int i
        		=0;i<5;i++) {
            b[i].display();
        }
    }
}