package song;

import java.util.Locale.FilteringMode;

/**
 * @author 彭华莉 2018年9月28日 Song.java
 */
public class Song {
	String songName;// 歌曲名字
	String singer;// 歌手
	String time;// 歌曲时长

	public Song(String songName, String singer, String time) {
		this.songName = songName;
		this.singer = singer;
		this.time = time;
	}

}
