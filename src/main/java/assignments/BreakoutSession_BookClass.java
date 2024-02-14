package assignments;

public class BreakoutSession_BookClass {
	
	private String ISBN,Title;
	private double Price;
	
	public BreakoutSession_BookClass(String ISBN,String Title,double Price)
	{
		this.ISBN=ISBN;
		this.Title=Title;
		this.Price=Price;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		this.Price = price;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		this.Title = title;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
	}
	

	
}
