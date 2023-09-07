
public class bike {
	private int bikeWheight;
	private String bikeType;
	private String description;
	public bike() {
		super();
		// TODO Auto-generated constructor stub
	}
	public bike(int bikeWheight, String bikeType, String description) {
		super();
		this.bikeWheight = bikeWheight;
		this.bikeType = bikeType;
		this.description = description;
	}
	public int getBikeWheight() {
		return bikeWheight;
	}
	public void setBikeWheight(int bikeWheight) {
		this.bikeWheight = bikeWheight;
	}
	public String getBikeType() {
		return bikeType;
	}
	public void setBikeType(String bikeType) {
		this.bikeType = bikeType;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
