package iphone;

public abstract class Device implements IMusicPlayer, ITelephone, IBrowser {

	@Override
	public void showPage(String url) {
		System.out.println("Opening website at: " + url);
	}

	@Override
	public void updatePage(String url) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addNewTab() {
		
	}

	@Override
	public void call(String contactName) {
		
	}

	@Override
	public void answer() {
		
	}

	@Override
	public void accessVoiceMail() {
		
	}

	@Override
	public void play(String songName) {
		
	}

	@Override
	public void pause(String songName) {
		
	}

	@Override
	public void selectSong(Song songName) {
		
	}


	
}
