public class Main1 {
	public static void main(String[] args) {
		//3-1 1から10までの乱数を発生させてそれを画面に表示し、5以上ならば、”5以上です”と表示するプログラムを作りなさい。
		int number = (int)(Math.random()*10)+1; //1から10までの乱数を発生させる
		System.out.println(number);
		if (number >= 5) { 
			System.out.println("5以上です");
		}
		
		
		//3-2 1から10までの乱数を発生させてそれを画面に表示し、その値が1でなければ”１ではありません”と表示するプログラムを作りなさい。
		int number2 = (int)(Math.random()*10)+1;
		System.out.println(number2);
		if (number2 != 1) {
			System.out.println("1ではありません");
		}
		
		
		//3-3 1から100までの乱数を発生させてそれを画面に表示し、、50未満ならば、”50未満です”と表示するプログラムを作りなさい。
		int number3 = (int)(Math.random()*100)+1;
		System.out.println(number3);
		if (number3 < 50) {
			System.out.println("50未満です");
		}
		
		
		//3-4 1から100までの乱数を発生させてそれを画面に表示し、値が10以下か、90以上なら、”10以下か90以上の値です”と表示するプログラムを作りなさい。
		int number4 = (int)(Math.random()*100)+1;
		System.out.println(number4);
		if (number4 <= 10 || number4 >= 90) {
			System.out.println("10以下か90以上の値です");
		}
		
		//3-5 1から100までの乱数を発生させてそれを画面に表示し、値が20以上80未満であれば、”20以上80未満です”と表示するプログラムを作りなさい。
		int number5 = (int)(Math.random()*100)+1;
		System.out.println(number5);
		if (number5 >= 20 && number5 < 80) {
			System.out.println("20以上80未満です");
		}
		
		
		//3-6 以下のプログラムは、1から6までの乱数（でたらめな数）を発生させて、表示させるプログラムです。
		int num = (int)(Math.random()*6)+1;
		System.out.println("数値 : " + num);
		//このプログラムをに3以上の数値が出た場合、「3以上です」と表示するプログラムを作りなさい。
		if (num >= 3) {
			System.out.println("3以上です");
		}
		
		
		//3-7 1から10までの乱数を発生させて表示し、5以上ならば、”5以上です”と表示し、そうでなければ、”5未満です”と表示するプログラムを作りなさい。
		int num2 = (int)(Math.random()*10)+1;
		System.out.println(num2);
		if (num2 >= 5) {
			System.out.println("5以上です");
		} else {
			System.out.println("5未満です");
		}
		
		
		//3-8 1から10までの乱数を発生させて表示し、その値が1でなければ”１ではありません”と表示し、1であれば、”1です。”と表示するプログラムを作りなさい。
		int num3 = (int)(Math.random()*10)+1;
		System.out.println(num3);
		if (num3 != 1) {
			System.out.println("1ではありません");
		} else if (num3 == 1){
			System.out.println("1です");
		}
		
		
		//3-9 １から100までの乱数を発生させて表示し、50未満ならば、”50未満です”とそうでなければ、”50以上です”と表示するプログラムを作りなさい。
		int num4 = (int)(Math.random()*100)+1;
		System.out.println(num4);
		if (num4 < 50) {
			System.out.println("50未満です");
		} else {
			System.out.println("50以上です");
		}
		
		
		//3-10 1から100までの乱数を発生させて表示し、値が10以下か、90以上なら、”10以下か90以上の値です”と表示し、そうでなければ、”10より大きく90未満です”と表示するプログラムを作りなさい。
		int num5 = (int)(Math.random()*100)+1;
		System.out.println(num5);
		if (num5 <= 10 || num5 >= 90) {
			System.out.println("10以下か90以上です");
		} else {
			System.out.println("10より大きく90未満です");
		}
		
		
		//3-11 １から100までの乱数を発生させ、値が20以上80未満であれば、”20以上80未満です”と表示し、そうでなければ、”20未満か、80以上です”と表示するプログラムを作りなさい。
		int num6 = (int)(Math.random()*100)+1;
		System.out.println(num6);
		if (num6 >=20 && num6 < 80) {
			System.out.println("20以上80未満です");
		} else {
			System.out.println("20未満か、80以上です");
		}
		
		
		//3-12 -10から10までの乱数を発生させて表示し、もしも負の値であれば”負の値です”と表示し、正の値であれば、”正の値です”と表示し、そうでなければ、”0です”と表示するプログラムを作りなさい。
		int num7 = (int)(Math.random()*21)-10; //0～20に-10にして、-10～10までを生成
		System.out.println(num7);
		if (num7 > 0) { //0は正でも負でもない
			System.out.println("正の値です0");
		} else if (num7 < 0) {
			System.out.println("負の値です");
		}
		
		
		//3-13 １から3の乱数を発生させ、１なら、”グー”、2なら、”パー”3なら”チョキ”と表示するプログラムを作りなさい。
		int num8 = (int)(Math.random()*3)+1;
		System.out.println(num8);
		switch(num8) {
		case 1:
			System.out.println("グー");
			break;
		case 2:
			System.out.println("パー");
			break;
		case 3:
			System.out.println("チョキ");
			break;
		}
		
	}
}