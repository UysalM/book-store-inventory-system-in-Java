import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    String authorName[] = new String[30];
    String bookTitle[] = new String[30];
    int stockNo[] = new int[30];
    double unitPrice[] = new double[30];
    boolean loopCondition = true;
    int menuSelection;
    int arrayPointer = 0;

    while(loopCondition) {
      System.out.println("Welcome to BookStore inventory Management System");
      System.out.println("1-)Add new book to inventory");
      System.out.println("2-)Update author name");
      System.out.println("3-)Update book title");
      System.out.println("4-)Update inventory stocks");
      System.out.println("5-)Update unit price");
      System.out.println("6-)Print inventory information");
      System.out.println("7-)Exit");
      System.out.println("Please enter menu item number of  the operation you wish to make");
      menuSelection = reader.nextInt();
      switch(menuSelection) {
        case 1: System.out.println("You have selected to add a new book"); 
                bookClass book = new bookClass();
                authorName[arrayPointer] = book.getAuthorName();
                bookTitle[arrayPointer] = book.getBookTitle();
                stockNo[arrayPointer] = book.getStockNo();
                unitPrice[arrayPointer] = book.getUnitPrice();
                arrayPointer++;
        break;
        case 2: System.out.println("You have selected to update author name");
                int arrayAuthor;
                for(int i = 0; i < 30; i++) {
                  System.out.println(i +"-) " + authorName[i]);
                }
                System.out.println("Which author do you whish to update(must be in range 0-29): ");
                arrayAuthor = reader.nextInt();
                System.out.println("Enter new author name: ");
                authorName[arrayAuthor] = reader.next();
        break;
        case 3: System.out.println("You have selected to update book title");
                int arrayBook;
                for(int i = 0; i < 30; i++) {
                  System.out.println(i +"-) " + bookTitle[i]);
                }
                System.out.println("Which title do you whish to update(must be in range 0-29): ");
                arrayBook = reader.nextInt();
                System.out.println("Enter new title: ");
                bookTitle[arrayBook] = reader.next();
        break;
        case 4: System.out.println("You have selected to update inventory stocks");
                int arrayUpdate;
                for(int i = 0; i < 30; i++) {
                  System.out.println(i +"-) " + stockNo[i]);
                }
                System.out.println("Which stock do you whish to update(must be in range 0-29): ");
                arrayUpdate = reader.nextInt();
                System.out.println("Enter new stock number: ");
                stockNo[arrayUpdate] = reader.nextInt();
        break;
        case 5: System.out.println("You have selected to update unit price");
                int arrayPrice;
                for(int i = 0; i < 30; i++) {
                  System.out.println(i +"-) " + stockNo[i]);
                }
                System.out.println("Which unit price do you whish to update(must be in range 0-29): ");
                arrayPrice = reader.nextInt();
                System.out.println("Enter new unit price: ");
                unitPrice[arrayPrice] = reader.nextDouble();
        break;
        case 6: System.out.println("You have selected to print inventory information");
                System.out.println("Author Name/" + "     Book Title/" + "     Stock Number/" + "     Unit Price");
                for(int y = 0; y < 30; y++) {
                  System.out.println(authorName[y] + "/     " + bookTitle[y] + "/     " + stockNo[y] + "/     " + unitPrice[y]);
                }
        break;
        case 7: System.out.println("Exiting");
                loopCondition = false;
        break;
        default: System.out.println("Wrong Selection");
      }
    }
  }
}