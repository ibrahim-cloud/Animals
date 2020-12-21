package Animals.com.mod;
import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
public class Animal {
	  private String name;
	    private int age;
	   
	    
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		
		
		public Animal(String name, int age) {
			super();
			this.name = name;
			this.age = age;
		
		}
		
		
		@Override
		public String toString() {
			return "\nName : "+ name +"\nAge : "+ age ;
		}
		

		public void ReadSound(String chemin,String typesound) throws UnsupportedAudioFileException, IOException, LineUnavailableException{
			
			
			
			 /*Path AbsolutePath = FileSystems.getDefault().getPath("").toAbsolutePath();*/
			
			File file = new File (chemin);
			
			AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
		
	           
	           Clip clip = AudioSystem.getClip();
	           clip.open(audioStream);
	           clip.start();
	           
	           System.out.println("************* le son de " + typesound + " c'est commencer ************ ");
	           System.out.println("**********  La voix d'un "+ typesound + "   *************");
	           while(clip.isActive()) {
                                 
                                 	}
	           clip.close();
	           System.out.println( "************  le son de " + typesound   + " est fini ************* ");
	                               }
                                 }


