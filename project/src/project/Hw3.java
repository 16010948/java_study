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
         System.out.print("상품추가(1), 모든 상품 조회(2), 끝내기(3)>>");
         int num=sc.nextInt();
         switch(num) {
         case 1:
            System.out.print("상품종류 책(1), 음악CD(2), 회화책(3)>>");
            int a=sc.nextInt();
            sc.nextLine();
            System.out.print("상품설명>>");
            String ex=sc.nextLine();
            System.out.print("생산자>>");
            String producer=sc.nextLine();
            System.out.print("가격>>");
            int price=sc.nextInt();
            sc.nextLine();
            if(a==1 || a==3) {
               System.out.print("책 제목>>");
               String title=sc.nextLine();
               System.out.print("저자>>");
               String author=sc.nextLine();
               System.out.print("ISBN 번호>>");
               String isbn=sc.nextLine();
               if(a==1) {
                  Product book=new Book(id++,ex,producer,price,isbn,author,title);
                  list[id-1]=book;
               }
               else {
                  System.out.print("언어>>");
                  String language=sc.nextLine();
                  Product conversation=new ConversationBook(id++,ex,producer,price,isbn,author,title,language);
                  list[id-1]=conversation;
               }
            }
            else {
               System.out.print("앨범 제목>>");
               String title=sc.nextLine();
               System.out.print("가수>>");
               String singer=sc.nextLine();
               Product CD=new CompactDisc(id++,ex,producer,price,singer,title);
               list[id-1]=CD;
            }
            break;
         case 2:
            for(int i=0;i<id;i++) {
               System.out.println("상품 ID>>"+list[i].id);
               System.out.println("상품 설명>>"+list[i].ex);
               System.out.println("생산자>>"+list[i].producer);
               System.out.println("가격>>"+list[i].price);
               if(list[i] instanceof Book || list[i] instanceof ConversationBook) {
                  System.out.println("ISBN>>"+((Book)list[i]).isbn);
                  System.out.println("가격>>"+((Book)list[i]).title);
                  System.out.println("ISBN>>"+((Book)list[i]).author);
                  if(list[i] instanceof ConversationBook) System.out.println("언어>>"+((ConversationBook)list[i]).language);
               }
               else if(list[i] instanceof CompactDisc) {
                  System.out.println("앨범 제목>>"+((CompactDisc)list[i]).title);
                  System.out.println("가수>>"+((CompactDisc)list[i]).singer);
                  
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