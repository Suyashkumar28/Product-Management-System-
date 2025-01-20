class Shirt{
	int size;
	String color;
	String brand;
	double price;
	Shirt(){
	}
	Shirt(String color, String brand){
		this.color=color;
		this.brand=brand;
	}
	Shirt(int size, String color, String brand, double price){
			this.size=size;
			this.color=color;
			this.brand=brand;
			this.price=price;
	}
	public String displayDetails(){
	return "Size: "+size+"\tColor: "+color+"\tBrand: "+brand+"\tPrice: "+price;
	}
}




