public class Main2 {
	public static void main(String[] args) {
		//1 1から10までの乱数を発生させてそれを画面に表示し、5以上ならば、”5以上です”と表示するプログラムを作りなさい。
		int num = (int)(Math.random() * 10) + 1;
		System.out.println("num = " + num);
		if (5 <= num) {
			System.out.println("5以上");
		}
		
		//2 1から10までの乱数を発生させてそれを画面に表示し、その値が1でなければ”１ではありません”と表示するプログラムを作りなさい。
		int num2 = (int)(Math.random() * 10) + 1;
		System.out.println("num2 = " + num2);
		if (num2 != 1) {
			System.out.println("1ではありません");
		}
		
		//3 1から100までの乱数を発生させてそれを画面に表示し、、50未満ならば、”50未満です”と表示するプログラムを作りなさい。
		int num3 = (int)(Math.random() * 100) + 1;
		System.out.println("num3 = " + num3);
		if (num3 < 50) {
			System.out.println("50未満です");
		}
		
		//4 1から100までの乱数を発生させてそれを画面に表示し、値が10以下か、90以上なら、”10以下か90以上の値です”と表示するプログラムを作りなさい。
		int num4 = (int)(Math.random() * 100) + 1;
		System.out.println("num4 = " + num4);
		if (num4 <= 10 || num4 >= 90) {
			System.out.println("10以下か90以上の値です");
		}
		
		//5 1から100までの乱数を発生させてそれを画面に表示し、値が20以上80未満であれば、”20以上80未満です”と表示するプログラムを作りなさい。
		int num5 = (int)(Math.random() * 100) + 1;
		System.out.println("num5 = " + num5);
		if (num5 >= 20 && num5 < 80) {
			System.out.println("20以上80未満です");
		}
		
		//6 このプログラムをに3以上の数値が出た場合、「3以上です」と表示するプログラムを作りなさい。
		int num6 = (int)(Math.random() * 6) + 1;
		System.out.println("num6 = " + num6);
		if (num6 >= 3) {
			System.out.println("3以上です");
		}
		
		//7 １から10までの乱数を発生させて表示し、5以上ならば、”5以上です”と表示し、そうでなければ、”5未満です”と表示するプログラムを作りなさい。
		int num7 = (int)(Math.random() * 10) + 1;
		System.out.println("num7 = " + num7);
		if (num7 >= 5) {
			System.out.println("5以上です");
		} else {
			System.out.println("5未満です");
		}
		
		//8 1から10までの乱数を発生させて表示し、その値が1でなければ”１ではありません”と表示し、1であれば、”1です。”と表示するプログラムを作りなさい。
		int num8 = (int)(Math.random() * 10) + 1;
		System.out.println("num8 = " + num8);
		if (num8 != 1) {
			System.out.println("1ではありません");
		} else if (num8 == 1) {
			System.out.println("1です");
		}
		
		//9 １から100までの乱数を発生させて表示し、50未満ならば、”50未満です”とそうでなければ、”50以上です”と表示するプログラムを作りなさい。
		int num9 = (int)(Math.random() * 100) + 1;
		System.out.println("num9 = " + num9);
		if (num9 < 50) {
			System.out.println("50未満です");
		} else {
			System.out.println("50以上です");
		}
		
		//10 1から100までの乱数を発生させて表示し、値が10以下か、90以上なら、”10以下か90以上の値です”と表示し、そうでなければ、”10より大きく90未満です”と表示するプログラムを作りなさい。
		int num10 = (int)(Math.random() * 100) + 1;
		System.out.println("num10 = " + num10);
		if (num10 <= 10 || num10 >= 90) {
			System.out.println("10以下か90以上です");
		} else {
			System.out.println("10より大きく90未満です");
		}
		
		//11 １から100までの乱数を発生させ、値が20以上80未満であれば、”20以上80未満です”と表示し、そうでなければ、”20未満か、80以上です”と表示するプログラムを作りなさい。
		int num11 = (int)(Math.random() * 100) + 1;
		System.out.println("num11 = " + num11);
		if (num11 >= 20 && num11 < 80) {
			System.out.println("20以上80未満です");
		} else {
			System.out.println("20未満か80以上です");
		}
		
		//12 -10から10までの乱数を発生させて表示し、もしも負の値であれば”負の値です”と表示し、正の値であれば、”正の値です”と表示し、そうでなければ、”0です”と表示するプログラムを作りなさい。
		int num12 = (int)(Math.random() * 21) -10;
		System.out.println("num12 = " + num12);
		if (num12 < 0) {
			System.out.println("負の値です");
		} else if (num12 > 0) {
			System.out.println("正の値です");
		} else {
			System.out.println("0です");
		}
		
		//13 １から3の乱数を発生させ、１なら、”グー”、2なら、”パー”3なら”チョキ”と表示するプログラムを作りなさい。
		int num13 = (int)(Math.random() * 3) + 1;
		System.out.println("num13 = " + num13);
		if (num13 == 1) {
			System.out.println("グー");
		} else if (num13 == 2) {
			System.out.println("パー");
		} else {
			System.out.println("チョキ");
		}
		
		//14 １から10までの二つの乱数を発生させ、それぞれa,bという変数に代入して表示し、aのほうが大きければ、”aのほうが大きいです。”と表示し、
		//   bのほうが大きければ”bのほうが大きいです。”と表示し、そうでなければ、”等しいです”と表示するプログラムを作りなさい。
		int a = (int)(Math.random() * 10) + 1;
		int b = (int)(Math.random() * 10) + 1;
		System.out.println("a = " + a + "  " + "b = " + b);
		if (a > b) {
			System.out.println("aのほうが大きいです");
		} else if (a < b) {
			System.out.println("bのほうが大きいです");
		} else {
			System.out.println("等しいです");
		}
		
		//15 １から100までの数値を乱数で発生させて表示し、以下の処理を行いなさい。
			/*80点以上なら”優”と表示。
			80点未満、70点以上なら、”良”と表示。
			70点未満、60点以上なら、”可”と表示。
			60点未満なら、”不可”と表示。*/
		int num15 = (int)(Math.random() * 100) + 1;
		System.out.println("num15 = " + num15);
		if (num15 >= 80) {
			System.out.println("優");
		} else if (num15 < 80 && num15 >= 70) {
			System.out.println("良");
		} else if (num15 < 70 && num15 >= 60) {
			System.out.println("可");
		} else if (num15 < 60) {
			System.out.println("不可");
		}
		
		//16 1から100までの数値を乱数で発生させて表示し、以下の処理をしなさい。
			/*２の倍数であるなら、”2の倍数です。”と表示
			３の倍数であるなら、”3の倍数です。”と表示
			ただし、2の倍数でもあり、3の倍数でもある場合は、”2と3の公倍数です。”と表示。*/
		int num16 = (int)(Math.random() * 100) + 1;
		System.out.println("num16 = " + num16);
		if (num16 % 2 == 0 && num16 % 3 == 0) {
			System.out.println("2と3の公倍数です");
		} else if (num16 % 3 == 0) {
			System.out.println("3の倍数です");
		} else if (num16 % 2 == 0) {
			System.out.println("2の倍数です");
		}
		
		//17 1から100までの数値を乱数で発生させ、以下の処理をしなさい。
			/*50以下の場合”50以下です。”と表示。
			偶数の場合、”偶数です。”と表示。
			ただし、50以下でかつ偶数の場合、”50以下の偶数です。”と表示。*/
		int num17 = (int)(Math.random() * 100) + 1;
		System.out.println("num17 = " + num17);
		if (num17 <= 50 && num17 % 2 == 0) {
			System.out.println("50以下の偶数です");
		} else if (num17 <= 50) {
			System.out.println("50以下です");
		} else if (num17 % 2 == 0) {
			System.out.println("偶数です");
		}
		
		//18 乱数で、－10から35までの乱数を発生させ、”摂氏○○度”（○○が、発生した乱数）と表示させ、その値により、以下のように表示しなさい。
			/*30度以上の場合は、”真夏日です。”と表示。
			25度以上、30度未満の場合”夏日です。”と表示。
			0度未満の場合、”真冬日です。”と表示。*/
		int num18 = (int)(Math.random() * 46) - 10;
		System.out.println("摂氏" + num18 + "度");
		if (num18 >= 30) {
			System.out.println("真夏日です");
		} else if (num18 >= 25 && num18 < 30) {
			System.out.println("夏日です");
		} else if (num18 < 0) {
			System.out.println("真冬日です");
		}
		
		
	}
}