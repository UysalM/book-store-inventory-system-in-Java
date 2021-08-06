import java.util.Scanner;
public class bookClass {
  Scanner read = new Scanner(System.in);
  String authorName, bookTitle;
  int stockNo;
  double unitPrice;

  String getAuthorName() {
    System.out.println("Enter Author Name: ");
    authorName = read.nextLine();
    return authorName;
  }
  String getBookTitle() {
    System.out.println("Enter Book Title: ");
    bookTitle = read.nextLine();
    return bookTitle;
  }
  int getStockNo() {
    System.out.println("Enter Stock Number: ");
    stockNo = read.nextInt();
    return stockNo;
  }
  double getUnitPrice() {
    System.out.println("Enter Unit Price: ");
    unitPrice = read.nextDouble();
    return unitPrice;
  }
}