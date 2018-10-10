package song;

import java.util.Scanner;

/**
 * @author 彭华莉 2018年9月28日 Player.java
 */
public class Player {
	// 将player所点的歌曲添加到要播放的歌单中
	public void addSong(Song song) {
		Master.listsong.add(song);
	}
}
