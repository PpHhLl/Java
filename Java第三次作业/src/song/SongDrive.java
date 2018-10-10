package song;

import java.io.StringBufferInputStream;
import java.util.ArrayList;
import java.util.Scanner;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * @author 彭华莉 2018年9月28日 SongDrive.java
 */
public class SongDrive {
	public Master master;// 主持人
	public Player player;// 点歌

	public SongDrive() {
		master = new Master();
		player = new Player();
		// 获取player所点歌曲的信息并判断点歌是否完毕
		Scanner in = new Scanner(System.in);
		boolean judge = true;
		while (judge) {
			System.out.println("请输入歌曲名字：");
			String songName = in.nextLine();
			System.out.println("请输入歌手：");
			String singer = in.nextLine();
			System.out.println("请输入歌曲时长：");
			String time = in.nextLine();
			player.addSong(new Song(songName, singer, time));
			System.out.println("是否继续点歌：（Y or N）");
			String isContinue = in.nextLine();
			if (isContinue.equals("N"))
				judge = false;
		}
		master.play();
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		SongDrive songDrive = new SongDrive();
	}
}
