package executeClass; 

import processClass.User;

/*

名前を入力したら下記がコンソールに出力されるように作ってください
	条件：数値は毎回変わるように作ってください
	 	 サブクラスを使用してください
		 スーパークラスを使用してください
		 getterとsetterを使用してください
		 packageを2つ作ってメインと処理を分けてください
		 命名する場合は規則にのっとってください
		 コンストラクタを使用してください

	こんにちは 「 名前 」 さん
	ステータス
	HP：849
	MP：862
	攻撃力：375
	素早さ：937
	防御力：24

	さあ冒険に出かけよう！

 */

// メインクラス
public class UserStatus {

	public static void main(String[] args) {

		
		// 静的メソッドにてランダムなステータスを生成
		User player = User.Character.generateRandomUser("名前");

		// 出力
		System.out.println("こんにちは 「 " + player.getUserName() + " 」 さん");
		System.out.println("ステータス");
		System.out.println("HP：" + player.getHP());
		System.out.println("MP：" + player.getMP());
		System.out.println("攻撃力：" + player.getPow());
		System.out.println("素早さ：" + player.getAgi());
		System.out.println("防御力：" + player.getDef());
		System.out.println("\nさあ冒険に出かけよう!");


	}

}
