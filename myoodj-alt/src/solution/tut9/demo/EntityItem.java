package solution.tut9.demo;

public class EntityItem {

	
	public EntityItem(String item1, String item2, String item3, String item4) {
		super();
		this.item1 = item1;
		this.item2 = item2;
		this.item3 = item3;
		this.item4 = item4;
	}

	private String item1, item2, item3, item4;

	public String getItem1() {
		return item1;
	}

	public void setItem1(String item1) {
		this.item1 = item1;
	}

	public String getItem2() {
		return item2;
	}

	public void setItem2(String item2) {
		this.item2 = item2;
	}

	public String getItem3() {
		return item3;
	}

	public void setItem3(String item3) {
		this.item3 = item3;
	}

	public String getItem4() {
		return item4;
	}

	public void setItem4(String item4) {
		this.item4 = item4;
	}

	@Override
	public String toString() {
		return "EntityItem [item1=" + item1 + ", item2=" + item2 + ", item3=" + item3 + ", item4=" + item4 + "]";
	}
	
	

}
