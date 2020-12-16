package Animals.com.mod;

public class Domstique  extends Animal{
	private String proprietaire;
;

	public String getOwner() {
		return proprietaire;
	}

	public void setOwner(String proprietaire) {
		this.proprietaire = proprietaire;
	}

	public Domstique(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	public Domstique(String name, int age,String proprietaire) {
		super(name, age);
		this.proprietaire = proprietaire;
		// TODO Auto-generated constructor stub
	}
public void play() {
		
	}

@Override
public String toString() {
	return "Domestique [proprietaire=" + proprietaire + ", toString()=" + super.toString() + "]";
}

	
}
