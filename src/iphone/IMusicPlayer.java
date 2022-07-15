package iphone;

interface IMusicPlayer {

	// all variables are public static final
		// static can't be instantiate
		// final can't be changed
	// all methods are public abstract
		// abstract can't be implemented - only formats it
	
	void play(String songName);
	
	void pause(String songName);
	
	void selectSong(String songName);
		
}
