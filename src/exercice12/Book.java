package exercice12;

import java.util.Arrays;

public class Book {
	private String name;
	private Author[] authors;
	private double price;
	private int qty;
	
	public Book(String name, Author[] author, double price) {
		this.name = name;
		this.authors = author;
		this.price = price;
		qty = 0;
	}
	
	public Book(String name, Author[] author, double price, int qty) {
		this.name = name;
		this.authors = author;
		this.price = price;
		this.qty = qty;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public String getName() {
		return name;
	}

	public Author[] getAuthor() {
		return authors;
	}


	public String getAuthorName() {
		StringBuilder authorNames = new StringBuilder();
        for (int i = 0; i < authors.length; i++) {
            authorNames.append(authors[i].getName());
            if (i < authors.length - 1) {
                authorNames.append(", ");
            }
        }
        return authorNames.toString();
	}
	
	
}
