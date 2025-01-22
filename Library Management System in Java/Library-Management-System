import java.util.*;
public class LibraryManagementSystem
 {
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        Library library=new Library();
        System.out.println("Welcome to the Library Management System!");
        while (true)
        {
            System.out.println("\nMenu:");
            System.out.println("1. Add Book");
            System.out.println("2. Add Member");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. List Books");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline
            switch (choice) 
            {
                case 1:
                    System.out.print("Enter book title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter book author: ");
                    String author = sc.nextLine();
                    library.addBook(title, author);
                    break;
                case 2:
                    System.out.print("Enter member name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter member ID: ");
                    String memberId = sc.nextLine();
                    library.addMember(name, memberId);
                    break;
                case 3:
                    System.out.print("Enter book title to issue: ");
                    String issueTitle = sc.nextLine();
                    System.out.print("Enter member ID: ");
                    String issueMemberId = sc.nextLine();
                    library.issueBook(issueTitle, issueMemberId);
                    break;
                case 4:
                    System.out.print("Enter book title to return: ");
                    String returnTitle = sc.nextLine();
                    library.returnBook(returnTitle);
                    break;
                case 5:
                    library.listBooks();
                    break;
                case 6:
                    System.out.println("Thank you for using the Library Management System. Goodbye!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
