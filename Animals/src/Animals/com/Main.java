package Animals.com;

import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;



import Animals.com.mod.Chat;
import Animals.com.mod.Dog;

public class Main {

	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		
	      while (true) {
	    Scanner reader = new Scanner(System.in);
	    System.out.println("Vous avez \n 1- un chat \n ou \n 2- un chien");
	    int choice = reader.nextInt();
	    Scanner reader1 = new Scanner(System.in);
		Scanner reader3 = new Scanner(System.in);
		System.out.println(" Entre le nom de votre animal:");
		String name = reader1.nextLine();
		System.out.println("Entrez l'âge de votre animal:");
		int age = reader1.nextInt();
		System.out.println(" Entre votre nom");
		String pro = reader3.nextLine();
	       	switch (choice){
		case 1:
			
			Chat chat = new Chat(name, age,pro);
			 System.out.println(" les information de votre chat : \n nom: "+name+" \n age: "+age+"\n proprietaire: "+pro+"");
	        	chat.ReadSound("CuteChat.wav", "chat");
		
	break;
		case 2 : 
			
			Dog Dog = new Dog(name, age,pro);
			System.out.println(" les information de votre chien : \n nom: "+name+" \n age: "+age+"\n proprietaire: "+pro+"");
	            Dog.ReadSound("chien-11.wav", "Chien");
	            break;
	       }

           }
        	
	       }

          }



