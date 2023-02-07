package oopsConcept;
import java.util.*;

public class comparator {
public static void main(String ar[]) {
	
	
	
	Set<Book> set=new TreeSet<Book>();    
    //Creating Books    
    Book b1=new Book(121,"Let us C","Yashwant Kanetkar","BPB",8);    
    Book b2=new Book(233,"Operating System","Galvin","Wiley",6);    
    Book b3=new Book(101,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);    
    //Adding Books to TreeSet    
    set.add(b1);    
    set.add(b2);    
    set.add(b3);    
    //Traversing TreeSet    
    for(Book b:set){    
    System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);    
    }    
}
}
class Book implements Comparable<Book>{    
int id;    
String name,author,publisher;    
int quantity;    
public Book(int id, String name, String author, String publisher, int quantity) {    
    this.id = id;    
    this.name = name;    
    this.author = author;    
    this.publisher = publisher;    
    this.quantity = quantity;    
}    
// implementing the abstract method  
public int compareTo(Book b) {    
    if(quantity>b.quantity){    
        return -1;    
    }else if(quantity<b.quantity){    
        return +1;    
    }else{    
    return 0;    
    }    
}    
}   