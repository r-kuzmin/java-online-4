package by.epam.training.cls.task10;

public class AircraftType {

	private AircraftBrand brand;
	private String model;
	
	public AircraftType() {
		this(null, "");
	}
	
	public AircraftType(AircraftBrand brand, String model) {
		super();
		this.brand = brand;
		this.model = model;
	}
	
	public AircraftBrand getBrand() {
		return brand;
	}
	
	public void setBrand(AircraftBrand brand) {
		this.brand = brand;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AircraftType other = (AircraftType) obj;
		if (brand != other.brand)
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "AircraftType [brand=" + brand + ", model=" + model + "]";
	}
	
}
