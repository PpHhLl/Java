package song;

import java.io.StringBufferInputStream;
import java.util.ArrayList;
import java.util.Scanner;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * @author ���� 2018��9��28�� SongDrive.java
 */
public class SongDrive {
	public Master master;// ������
	public Player player;// ���

	public SongDrive() {
		master = new Master();
		player = new Player();
		// ��ȡplayer�����������Ϣ���жϵ���Ƿ����
		Scanner in = new Scanner(System.in);
		boolean judge = true;
		while (judge) {
			System.out.println("������������֣�");
			String songName = in.nextLine();
			System.out.println("��������֣�");
			String singer = in.nextLine();
			System.out.println("���������ʱ����");
			String time = in.nextLine();
			player.addSong(new Song(songName, singer, time));
			System.out.println("�Ƿ������裺��Y or N��");
			String isContinue = in.nextLine();
			if (isContinue.equals("N"))
				judge = false;
		}
		master.play();
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		SongDrive songDrive = new SongDrive();
	}
}
