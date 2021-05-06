class Library<I>
{
	Class C = null;
	
	public Library(Class C)
	{
		this.C = C;
	}

	public I getInstance() throws InstantiationException, IllegalAccessException
	{
		return (I) this.C.newInstance();
	}
}

class Book
{
	public String method()
	{
		return "This is an example of book class";
	}
}

class Video
{
	public String method()
	{
		return "This is an example of video class";		
	}
}

class Newspaper
{
	public String method()
	{
		return "This is an example of Newspaper class";
	}
}

public class GenClass1
{
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		
		Library<Book> bookLib = new Library<Book>(Book.class);
		Book book = bookLib.getInstance();
		System.out.println(book.method());
		
		Library<Video> videoLib = new Library<Video>(Video.class);
		Video video = videoLib.getInstance();
		System.out.println(video.method());

		Library<Newspaper> newspaperLib = new Library<Newspaper>(Newspaper.class);
		Newspaper newspaper = newspaperLib.getInstance();
		System.out.println(newspaper.method());
	}	
} 