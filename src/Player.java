
public abstract class Player {
	
	private String Name, RoshamboValue;
	
	public abstract String generateRoshambo();

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getRoshamboValue() {
		return RoshamboValue;
	}

	public void setRoshamboValue(String roshamboValue) {
		RoshamboValue = roshamboValue;
	}
	
}
