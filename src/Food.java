public class Food extends Product{
	private String bestBefore;

	public String getBestBefore() {
		return bestBefore;
	}

	public void setBestBefore(String bestBefore) {
		this.bestBefore = bestBefore;
	}

	Food(String name, int price, String bestBefore){
		super(name, price);
		this.bestBefore = bestBefore;
		System.out.println(name +"の値段は"+ price +"円、賞味期限は"+ bestBefore +"です" );
	}
}
