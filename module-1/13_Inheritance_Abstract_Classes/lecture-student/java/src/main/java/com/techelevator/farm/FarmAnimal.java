package com.techelevator.farm;

public class FarmAnimal implements Singable {
	private String name;
	private String sound;
	private boolean asleep;



	public FarmAnimal(String name, String sound) {
		this.name = name;
		this.sound = sound;
		this.asleep = false;
	}

	public String getName( ) {
		return name;
	}

	public String getSound( ) {
		if (asleep) {
			return "Zzzzz";
		}
	  return "cluck!";
	}

	public boolean isAsleep() {
		return asleep;
	}
	public void  setAsleep(boolean asleep){
		this.asleep = asleep;
	}
}