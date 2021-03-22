package interface_demo;

public class Dog extends Animal implements Personhood, Friend {

	private String name = "";
	private int friendLevel = 0;
	
	public Dog(String aName, int friendLvl)  {
		name = aName;
		friendLevel = friendLvl;
	}
	
	public boolean testDoNotConsume() {
		return DoNotConsume;
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public int getFriendLevel() {
		return friendLevel;
	}
	
}
