package iphone;

import java.util.Scanner;

public class Run extends Device {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Device device = new Device();
		
		System.out.println("----- accessing browser menu -----");
		System.out.println("Please type the site url:");
		String url = sc.nextLine();
			
		device.showPage(url);
		System.out.println("Press 1 to update the page.");
		if (sc.nextInt() == 1) {
			device.updatePage(url);
		} else {
			System.out.println("Wrong option. Please try again.");	
		}
		
		device.addNewTab();
		
		sc.nextLine();
		System.out.println("----- accessing phone menu -----");
		
		System.out.println("Who you gonna call?");
		String contact = sc.nextLine();
		device.call(contact);
		
		device.answerCall();
		device.accessVoiceMail();
		
		System.out.println("----- accessing music menu -----");
		System.out.println("Select a song to listen:");
		String song = sc.nextLine();

		device.selectSong(song);
		device.play(song);
		
		System.out.println("Type '2' to pause the song:");
		if (sc.nextInt() == 2) {
			device.pause(song);
		} else {
			System.out.println("Wrong letter typed. Music still playing.");	
		}
		
		sc.nextLine();
		System.out.println("----- End of activity. -----");
		sc.close();
		
	}

}
