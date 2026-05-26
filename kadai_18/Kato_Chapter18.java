package kadai_18;

abstract public class Kato_Chapter18 {
	public String familyName;
	public String givenName;
	public String address;
	
	public void commonIntroduce(){
		System.out.println("名前は" + this.familyName + this.givenName + "です");
		System.out.println("住所は" + this.address + "です");
		
	}
	
	abstract public void eachIntroduce();
	
	public void execIntroduce() {
		commonIntroduce();
		eachIntroduce();
		
	}

}
