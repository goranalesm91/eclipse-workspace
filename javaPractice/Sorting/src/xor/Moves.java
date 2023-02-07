package xor;

public class Moves {
//	Create a class named Movie which contains multiple data members name,description, actor, actors,
//	collection amount etc, also contains getters setters and method isBlockBuster based on collection amount ?
	
	
	
	

	public static void main(String[] args) {
		Movies1 m1=new Movies1();
		m1.isBlockBuster(50000,"Sagar");
	}

}
class Movies1{
	String name;
	String description;
	String actor;
	String actors;
	int  collection_Amount;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
		}
	
	public int getCollection_Amount() {
		return collection_Amount;
	}
	public void setCollection_Amount(int collection_Amount) {
		this.collection_Amount=collection_Amount;
	}
	
	public void isBlockBuster(int amount,String name) {
		setCollection_Amount(amount);
		setName(name);
		
		if(collection_Amount >= 10000) {
			System.out.println("it is BlockBuster");
		}
	}
	
}
