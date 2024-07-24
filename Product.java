public class Product
{


  private int productid;


  private String productName;


  private double price;




  // Default constructor

  public Product ()
  {


	this.productid = 0;


	this.productName = "";


	this.price = 0.0;


  }



  // Parameterized constructor with productid and productName

  public Product (int productid, String productName)
  {


	this.productid = productid;


	this.productName = productName;


	this.price = 0.0;			// Default price

  }



  // Parameterized constructor with all attributes

  public Product (int productid, String productName, double price)
  {


	this.productid = productid;


	this.productName = productName;


	this.price = price;


  }



  // Method to display product details

  public void displayDetails ()
  {


	System.out.println ("Product ID: " + productid);


	System.out.println ("Product Name: " + productName);


	System.out.println ("Product Price: $" + price);


  }



  public static void main (String[]args)
  {


	// Create objects using each constructor

	Product defaultProduct = new Product ();


	Product productWithIdName = new Product (11, "Keyboard", 15.99);


	Product fullProduct = new Product (12, "Mouse", 25.99);




	// Display product details

	System.out.println ("Default Product:");


	defaultProduct.displayDetails ();




	System.out.println ("\nProduct with ID and Name:");


	productWithIdName.displayDetails ();




	System.out.println ("\nProduct with all attributes:");


	fullProduct.displayDetails ();


  }

}
