package project;

import java.util.*;


class Product{
   int id,price;
   String ex,producer;
   Scanner sc=new Scanner(System.in);
   public Product () {}
   public Product (int id,String ex,String producer,int price) {
      this.id=id;
      this.ex=ex;
      this.producer=producer;
      this.price=price;
   }
   
}

class Book extends Product{
   String author,title,isbn;
   Scanner sc=new Scanner(System.in);
   public Book() {}
   public Book(int id,String ex,String producer,int price,String isbn,String author,String title) {
      super(id,ex,producer,price);
      this.isbn=isbn;
      this.author=author;
      this.title=title;
   }
   
}

class CompactDisc extends Product{
   String title,singer;
   Scanner sc=new Scanner(System.in);
   public CompactDisc() {}
   public CompactDisc(int id,String ex,String producer,int price,String singer,String title) {
      super(id,ex,producer,price);
      this.title=title;
      this.singer=singer;
   }
}

class ConversationBook extends Book{
   String language;
   public ConversationBook() {}
   public ConversationBook(int id,String ex,String producer,int price,String isbn,String author,String title,String language) {
      super(id,ex,producer,price,isbn,author,title);
      this.language=language;
   }

}

public class Hw3 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      
      Scanner sc=new Scanner(System.in);
      boolean flag=true;
      int id=0;
      
      Product[] list=new Product[10];
      
      while(id<10) {
         System.out.print("��ǰ�߰�(1), ��� ��ǰ ��ȸ(2), ������(3)>>");
         int num=sc.nextInt();
         switch(num) {
         case 1:
            System.out.print("��ǰ���� å(1), ����CD(2), ȸȭå(3)>>");
            int a=sc.nextInt();
            sc.nextLine();
            System.out.print("��ǰ����>>");
            String ex=sc.nextLine();
            System.out.print("������>>");
            String producer=sc.nextLine();
            System.out.print("����>>");
            int price=sc.nextInt();
            sc.nextLine();
            if(a==1 || a==3) {
               System.out.print("å ����>>");
               String title=sc.nextLine();
               System.out.print("����>>");
               String author=sc.nextLine();
               System.out.print("ISBN ��ȣ>>");
               String isbn=sc.nextLine();
               if(a==1) {
                  Product book=new Book(id++,ex,producer,price,isbn,author,title);
                  list[id-1]=book;
               }
               else {
                  System.out.print("���>>");
                  String language=sc.nextLine();
                  Product conversation=new ConversationBook(id++,ex,producer,price,isbn,author,title,language);
                  list[id-1]=conversation;
               }
            }
            else {
               System.out.print("�ٹ� ����>>");
               String title=sc.nextLine();
               System.out.print("����>>");
               String singer=sc.nextLine();
               Product CD=new CompactDisc(id++,ex,producer,price,singer,title);
               list[id-1]=CD;
            }
            break;
         case 2:
            for(int i=0;i<id;i++) {
               System.out.println("��ǰ ID>>"+list[i].id);
               System.out.println("��ǰ ����>>"+list[i].ex);
               System.out.println("������>>"+list[i].producer);
               System.out.println("����>>"+list[i].price);
               if(list[i] instanceof Book || list[i] instanceof ConversationBook) {
                  System.out.println("ISBN>>"+((Book)list[i]).isbn);
                  System.out.println("����>>"+((Book)list[i]).title);
                  System.out.println("ISBN>>"+((Book)list[i]).author);
                  if(list[i] instanceof ConversationBook) System.out.println("���>>"+((ConversationBook)list[i]).language);
               }
               else if(list[i] instanceof CompactDisc) {
                  System.out.println("�ٹ� ����>>"+((CompactDisc)list[i]).title);
                  System.out.println("����>>"+((CompactDisc)list[i]).singer);
                  
               }
            }
            break;
         case 3:
            flag=false;
            break;
         }
      }
   }

}