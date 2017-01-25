package com.training;

public class Book
{
	public String Id;
	public String Name;
	public String Author;
	public String Price;
	
	public Book()
	{
		System.out.println("Book default constructor.");
	}
	
	public Book(String Id, String Name, String Author, String Price)
	{
		this.Id = Id;
		this.Name = Name;
		this.Author = Author;
		this.Price = Price;
	
	}
	
	public void  BookDetails (){
		
	
			Book book1 = new Book();
			book1.Id = "ISBN-1234";
			book1.Name = "Java";
			book1.Author = "Rakesh";
			book1.Price = "$100";
			
			System.out.println("Book ID = "+book1.Id);		
			System.out.println("Book Name = "+book1.Name);
			System.out.println("Book Author = "+book1.Author);
			System.out.println("Book Price = "+book1.Price);
			
		}

	public void getbook1Id() {
		// TODO Auto-generated method stub
		
	}		
			
						
	public void getbook1Name() {
		// TODO Auto-generated method stub
		
	}	
	
	public void getbook1Author() {
		// TODO Auto-generated method stub
	
	}	
	
	public void getbook1Price() {
		// TODO Auto-generated method stub
		
	}	
	
	}
	
	