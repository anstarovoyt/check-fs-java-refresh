package kkey.tst;

import java.io.File;
import java.io.IOException;

public class Main
{
	public static final int COUNTER = 2000;

	public static void main(String[] args) throws IOException, InterruptedException
	{

		File parent = new File("data-test");
		parent.mkdir();

		for (int i = 0; i < COUNTER; i++)
		{
			File dir = new File("data-test/forder-name-test-" + i);
			dir.mkdir();

			File dir2 = new File("data-test/forder-name-test-" + i);
			Process exec = Runtime.getRuntime().exec(new String[]{"touch", " test.data"}, new String[0], dir);
			exec.waitFor();
			assert dir2.list().length > 0;
		}

		System.out.print("successful");
	}
}
