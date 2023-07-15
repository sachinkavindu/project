abstract class LibraryItem
{
	private String title;
	private String itemId;
	private boolean checkedOut;
	
	LibraryItem(String title,String itemId)
	{
		this.title=title;
		this.itemId=itemId;
		this.checkedOut=false;
	}
	
	public void checkOut()
	{
		checkedOut=true;
		System.out.println(title+" checked Out");
	}
	
	public void checkIn()
	{
		checkedOut=false;
		System.out.println(title+" checked In");
	}
	
	public void displayItemDetails()
	{
		System.out.print("Title : "+title+"\tItem ID : "+itemId+"\tStatus : "+(checkedOut?"Checked out":"Available"));
	}
}