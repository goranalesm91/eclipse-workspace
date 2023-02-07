package Opps;

class teset{
	private int data;
	private String name;
	
	public void setData(int data) {
		this.data=data;
	}
	public void setName(String name ) {
		this.name=name;
	}
	public int  getData() {
		return data;
	}
	public String  getName() {
		return name;
	}
}
public class Ecapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  teset t=new teset();
  t.setData(45);
  t.setName("Siddharam");
  System.out.println(t.getData());
  
  System.out.println(t.getName());
	}

}
