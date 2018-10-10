package song;

import java.util.ArrayList;

/**
 * @author 彭华莉 2018年9月28日 Master.java
 */

public class Master {
	public static ArrayList<Song> listsong;// 由要播放的歌曲组成的歌单
	// 构造函数

	public Master() {
		listsong = new ArrayList<>();
	}

	// 打印出要播放的歌曲的基本信息
	public void play() {
		for (Song song : listsong) {
			System.out.println("歌名：" + song.songName);
			System.out.println("演唱歌手：" + song.singer);
			System.out.println("歌曲时长：" + song.time);
		}
	}

}
