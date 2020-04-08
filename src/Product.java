public class Product {
	private String name;
	private int price;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	//引数指定なし
	Product(){
		//何もしない
	}
	//引数指定２つ
	Product(String name, int price){
		this.setName(name);
		this.setPrice(price);
	}
}
