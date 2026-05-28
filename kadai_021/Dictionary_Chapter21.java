package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	HashMap<String,String>  dictionary = new HashMap<String,String>();
	
	public void addWords() {
	dictionary.put("apple", "りんご");
	dictionary.put("peach", "桃");
	dictionary.put("banana", "バナナ");
	dictionary.put("lemon", "レモン");
	dictionary.put("pear", "梨");
	dictionary.put("kiwi", "キウィ");
	dictionary.put("strawberry", "いちご");
	dictionary.put("grape", "ぶどう");
	dictionary.put("muscat", "マスカット");
	dictionary.put("cherry", "さくらんぼ");
	

	}
	
	// 辞書に「あるかないか」を調べるメソッド
	public void searchWords(String[] searchWords) {
		
		// 調べる英単語の数だけ繰り返し
		for (int i = 0; i < searchWords.length; i++) {
			
			// 今から調べる単語を1つ取り出す（例: "apple"）
			String word = searchWords[i];
			
			// ★「もし、辞書にその単語（キー）が含まれていたら」
			if (dictionary.containsKey(word)) {
				// フローチャート：辞書に追加されている場合
                // 意味を出力するために、ここで辞書から意味を引っ張ってくる
				String meaning = dictionary.get(word);
				System.out.println(word + "の意味は" + meaning );
				
			} else {
				// フローチャート：辞書に追加されていない場合（含まれていなかったら）
				System.out.println(word + "辞書には存在しません");
			}
		}
	}
	
}