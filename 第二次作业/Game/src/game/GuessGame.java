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
			//�Ӽ��̻�ȡ��Ҳ²������
			Scanner in = new Scanner(System.in);
			System.out.println("�����(0,9):");
			int number = in.nextInt();
			if (player.num < number) {
				System.out.println("�´���");
				player.score = player.score - 10;
			} else if (player.num > number) {
				System.out.println("��С��");
				player.score = player.score - 10;
			} else if (player.num == number) {
				System.out.println("��¶���!");
				break;
			}

		}
	}

}
