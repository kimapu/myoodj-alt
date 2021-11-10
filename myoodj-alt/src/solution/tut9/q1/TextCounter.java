package solution.tut9.q1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TextCounter {

	// targetFile
	private String targetFile;

	public TextCounter(String targetFile) {
		this.targetFile = targetFile;
	}

	/**
	 * Hint: FileReader for counting characters; BufferedReader for counting lines;
	 * Scanner for counting word
	 */
	/**
	 * countChars()
	 * 
	 * @return int
	 */
	public int countChars() {
		int charCount = 0;
		try (FileReader in = new FileReader(targetFile);) {
			int c;
			while ((c = in.read()) != -1) {
				charCount++;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return charCount;

	}

	/**
	 * countWords()
	 * 
	 * @return int
	 */
	public int countWords() {
		int nWord = 0;
		try (Scanner f = new Scanner(new FileReader(targetFile))) {
			while (f.hasNext()) {
				String test = f.next();
				nWord++;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return nWord;
	}

	/**
	 * countLines()
	 * 
	 * @return int
	 */
	public int countLines() {
		int nLine = 0;
		try (BufferedReader in = new BufferedReader(new FileReader(targetFile))) {
			String line;
			while ( (line = in.readLine()) != null ) {
				nLine++;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return nLine;
	}

}
