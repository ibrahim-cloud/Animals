package Animals.com;

import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;



import Animals.com.mod.Animal;
import Animals.com.mod.Chat;

public class Main {

	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		// TODO Auto-generated method stub
		Chat chat1 = new Chat("Caniche", 2,"Taoufiq");
		Animal chat2 = new Chat("Caniche", 2,"Taoufiqd");
		
	
		chat2.ReadSound("\\Sound\\CuteChat.wav", "chat1");
		
	}
	
	
	
	

}


