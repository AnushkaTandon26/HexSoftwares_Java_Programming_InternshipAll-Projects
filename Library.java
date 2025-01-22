import java.util.ArrayList;
public class Library 
{
    private ArrayList<Book> books;
    private ArrayList<Member> members;
    public Library()
    {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    public void addBook(String title, String author)
    {
        Book newBook = new Book(title, author);
        books.add(newBook);
        System.out.println("Book added: " + title + " by " + author);
    }

    public void addMember(String name, String memberId) 
    {
        Member newMember = new Member(name, memberId);
        members.add(newMember);
        System.out.println("Member added: " + name + " (ID: " + memberId + ")");
    }

    public void issueBook(String title, String memberId)
    {
        Book bookToIssue = findBook(title);
        Member issuingMember = findMember(memberId);
        if (bookToIssue != null && issuingMember != null)
        {
            if (!bookToIssue.isIssued()) 
            {
                bookToIssue.setIssued(true);
                System.out.println("Book issued: " + title + " to " + issuingMember.getName());
            } else {
                System.out.println("Book is already issued to someone else.");
            }
        }
        else
        {
            System.out.println("Book or Member not found.");
        }
    }

    public void returnBook(String title)
    {
        Book bookToReturn = findBook(title);
        if (bookToReturn != null)
        {
            if (bookToReturn.isIssued())
            {
                bookToReturn.setIssued(false);
                System.out.println("Book returned: " + title);
            } else 
            {
                System.out.println("Book is not currently issued.");
            }
        } else 
        {
            System.out.println("Book not found.");
        }
    }

    public void listBooks()
    {
        System.out.println("Books in the library:");
        for (Book book : books)
        {
            System.out.println(book.getTitle() + " by " + book.getAuthor() +
                (book.isIssued() ? " (Issued)" : " (Available)"));
        }
    }

    private Book findBook(String title)
    {
        for (Book book : books)
        {
            if (book.getTitle().equalsIgnoreCase(title)) 
            {
                return book;
            }
        }
        return null;
    }

    private Member findMember(String memberId)
    {
        for (Member member : members)
        {
            if (member.getMemberId().equalsIgnoreCase(memberId)) 
            {
                return member;
            }
        }
        return null;
    }
}
