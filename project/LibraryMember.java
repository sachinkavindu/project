public class LibraryMember
{
	private String memberID;
	private String name;
	
	LibraryMember(String memberID,String name)
	{
		this.memberID=memberID;
		this.name=name;
	}
	
	public void displayMemberDetails()
	{
		System.out.println("Member ID : "+memberID+"\tMember name : "+name);
	}
}