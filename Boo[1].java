public class Boo
{
	public static void main (String[]args)
	{
		Book book1 = new Book ("The Great Gatsby", "F. Scott Fitzgerald");
		Book book2 = new Book ("To Kill a Mockingbird", "Harper Lee");


		  System.out.println ("Initial book1: " + book1.getTitle () + " by " +
													book1.getAuthor ());
		  System.out.println ("Initial book2: " + book2.getTitle () + " by " +
													book2.getAuthor ());


		  book2.setTitle ("Go Set a Watchman");


		  System.out.println ("Updated book1: " + book1.getTitle () + " by " +
													book1.getAuthor ());
		  System.out.println ("Updated book2: " + book2.getTitle () + " by " +
													book2.getAuthor ());
	}
}

class Book
{
	private String title;
	private String author;


	public Book (String title, String author)
	{
		this.title = title;
		this.author = author;
	}


	public String getTitle ()
	{
		return title;
	}



	public void setTitle (String title)
	{
		this.title = title;
	}


	public String getAuthor ()
	{
		return author;
	}


	public void setAuthor (String author)
	{
		this.author = author;
	}
}
