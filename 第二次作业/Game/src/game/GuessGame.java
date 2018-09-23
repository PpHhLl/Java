package game;

import java.util.Scanner;

import javax.print.attribute.standard.RequestingUserName;
import javax.xml.stream.events.StartDocument;

public class GuessGame {
	Player player = new Player();

	public GuessGame(Player player) {
		this.startGame(player);
	}

	public void startGame(Player player) {

		while (true) {
			//从键盘获取玩家猜测的数字
			Scanner in = new Scanner(System.in);
			System.out.println("请猜数(0,9):");
			int number = in.nextInt();
			if (player.num < number) {
				System.out.println("猜大了");
				player.score = player.score - 10;
			} else if (player.num > number) {
				System.out.println("猜小了");
				player.score = player.score - 10;
			} else if (player.num == number) {
				System.out.println("你猜对啦!");
				break;
			}

		}
	}

}
