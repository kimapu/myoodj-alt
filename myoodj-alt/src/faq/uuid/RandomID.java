package faq.uuid;

import java.util.UUID;

public class RandomID {

	public static void main(String[] args) {

		for (int i = 0; i < 1000; i++) {
			System.out.println( UUID.randomUUID() );
		}
		
		
	}

}
