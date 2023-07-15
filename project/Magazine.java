public class Magazine extends LibraryItem
{
	private String issueDate;
	private String publisher;
	
	Magazine(String title,String itemId,String issueDate,String publisher)
	{
		super(title,itemId);
		this.issueDate=issueDate;
		this.publisher=publisher;
	}
	
	public void displayItemDetails()
	{
		super.displayItemDetails();
		System.out.println("Issue Date : "+issueDate+"\tPublisher : "+publisher);
	}
	
}