package game;

import java.util.Scanner;

import org.omg.CORBA.PUBLIC_MEMBER;

public class GuessLauncher {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Player[] player = { null, null, null };
		for (int i = 0; i < 3; i++) {
			player[i] = new Player();
			GuessGame game = new GuessGame(player[i]);
			System.out.println("��" + (i + 1) + "����ҵĵ÷�Ϊ" + player[i].score);
		}
		for (int i = 0; i < 3; i++) {
			System.out.println("��" + (i + 1) + "����ҵĵ÷�Ϊ" + player[i].score);
		}
		if (player[0].score > player[1].score && player[0].score > player[2].score) {
			System.out.println("���1ʤ����");
		} else if (player[1].score > player[0].score && player[1].score > player[2].score) {
			System.out.println("���2ʤ����");
		} else if (player[2].score > player[0].score && player[2].score > player[1].score) {
			System.out.println("���3ʤ����");
		} else if (player[0].score > player[1].score && player[0].score == player[2].score) {
			System.out.println("���1�����3ʤ����");
		} else if (player[1].score > player[0].score && player[1].score == player[2].score) {
			System.out.println("���2�����3ʤ����");
		} else if (player[0].score > player[2].score && player[0].score == player[1].score) {
			System.out.println("���1�����2ʤ����");
		} else
			System.out.println("�˾�Ϊƽ�֣�");
	}
}
