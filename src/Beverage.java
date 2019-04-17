
public class Beverage {

	public int healthRating;
	public String type;
	
	public void drink() {
		System.out.println("Ahhhh");
	}
	
	public Beverage() {
		
	};
	
	public Beverage(int healthRating, String type) {
		this.healthRating = healthRating;
		this.type = type;
	}
	
	public int getHealthRating() {
		return this.healthRating;
	}
	
	public void setHealthRating(int healthRating) {
		this.healthRating = healthRating;
	}
	
	public String getType() {
		return this.type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
}
