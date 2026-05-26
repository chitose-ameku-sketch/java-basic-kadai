package kadai_18;

public class KatoExec_Chapter18 {
	public static void main(String[] args) {
		KatoTaro_Chapter18 Taro = new KatoTaro_Chapter18 ();
		
		Taro.familyName = "加藤";
		Taro.address = "東京都中野区〇×";
		
		Taro.setGivenName();
		
		Taro.execIntroduce();
		

		KatoIchiro_Chapter18 Ichiro = new KatoIchiro_Chapter18 ();	
		
		Ichiro.familyName = "加藤";
		Ichiro.address = "東京都中野区〇×";
		
		Ichiro.setGivenName();
		
		Ichiro.execIntroduce();
		

		KatoHanako_Chapter18 Hanako = new KatoHanako_Chapter18 ();	
		
		Hanako.familyName = "加藤";
		Hanako.address = "東京都中野区〇×";
		
		Hanako.setGivenName();
		
		Hanako.execIntroduce();
		
	}
	
	

}
