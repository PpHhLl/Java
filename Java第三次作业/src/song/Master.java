package song;

import java.util.ArrayList;

/**
 * @author ���� 2018��9��28�� Master.java
 */

public class Master {
	public static ArrayList<Song> listsong;// ��Ҫ���ŵĸ�����ɵĸ赥
	// ���캯��

	public Master() {
		listsong = new ArrayList<>();
	}

	// ��ӡ��Ҫ���ŵĸ����Ļ�����Ϣ
	public void play() {
		for (Song song : listsong) {
			System.out.println("������" + song.songName);
			System.out.println("�ݳ����֣�" + song.singer);
			System.out.println("����ʱ����" + song.time);
		}
	}

}
