package com.my.test;

public class Book {
	private int bookId;// 图书ID
	private String name;// 名称
	private int bookTypeId;// 图书类别
	private String author;// 作者
	private String press;// 出版社
	private float price;// 价格
	private String bookNum;// 书号
	private boolean isRecommend;// 是否推荐
	private boolean isPutaway;// 是否上架
	private String img;// 图片
	public int getBookId() {
		return bookId;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", name=" + name + ", bookTypeId=" + bookTypeId + ", author=" + author
				+ ", press=" + press + ", price=" + price + ", bookNum=" + bookNum + ", isRecommend=" + isRecommend
				+ ", isPutaway=" + isPutaway + ", img=" + img + "]";
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBookTypeId() {
		return bookTypeId;
	}
	public void setBookTypeId(int bookTypeId) {
		this.bookTypeId = bookTypeId;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPress() {
		return press;
	}
	public void setPress(String press) {
		this.press = press;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getBookNum() {
		return bookNum;
	}
	public void setBookNum(String bookNum) {
		this.bookNum = bookNum;
	}
	public boolean isRecommend() {
		return isRecommend;
	}
	public void setRecommend(boolean isRecommend) {
		this.isRecommend = isRecommend;
	}
	public boolean isPutaway() {
		return isPutaway;
	}
	public void setPutaway(boolean isPutaway) {
		this.isPutaway = isPutaway;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	
}
