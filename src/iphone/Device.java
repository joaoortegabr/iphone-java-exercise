package iphone;

public class Device implements IMusicPlayer, ITelephone, IBrowser {

	@Override
	public void showPage(String url) {
		System.out.println("Opening website at: " + url);
	}

	@Override
	public void updatePage(String url) {
		System.out.println("Updating website " + url + " now.");
	}

	@Override
	public void addNewTab() {
		System.out.println("New tab added.");
	}

	@Override
	public void call(String contactName) {
		System.out.println("Calling " + contactName + ".");
	}

	@Override
	public void answerCall() {
		System.out.println("Incoming call.");
	}

	@Override
	public void accessVoiceMail() {
		System.out.println("Accessing voice mail.");
	}

	@Override
	public void selectSong(String songName) {
		System.out.println(songName + " selected.");
	}
	
	@Override
	public void play(String songName) {
		System.out.println("Playing now " + songName + ".");
	}

	@Override
	public void pause(String songName) {
		System.out.println(songName + " paused.");
	}




	
}
