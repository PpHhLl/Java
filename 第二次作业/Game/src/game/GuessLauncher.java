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
			System.out.println("第" + (i + 1) + "个玩家的得分为" + player[i].score);
		}
		for (int i = 0; i < 3; i++) {
			System.out.println("第" + (i + 1) + "个玩家的得分为" + player[i].score);
		}
		if (player[0].score > player[1].score && player[0].score > player[2].score) {
			System.out.println("玩家1胜利！");
		} else if (player[1].score > player[0].score && player[1].score > player[2].score) {
			System.out.println("玩家2胜利！");
		} else if (player[2].score > player[0].score && player[2].score > player[1].score) {
			System.out.println("玩家3胜利！");
		} else if (player[0].score > player[1].score && player[0].score == player[2].score) {
			System.out.println("玩家1与玩家3胜利！");
		} else if (player[1].score > player[0].score && player[1].score == player[2].score) {
			System.out.println("玩家2与玩家3胜利！");
		} else if (player[0].score > player[2].score && player[0].score == player[1].score) {
			System.out.println("玩家1与玩家2胜利！");
		} else
			System.out.println("此局为平局！");
	}
}
