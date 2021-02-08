package by.epam.training.cls.task10;

public enum AircraftBrand {
	AIRBUS("Airbus"), BOEING("Boeing"), BOMBARDIER("Bombardier"), CESSNA("Cessna"), FALKON("Falkon"),
	EMBRAER("Embraer"), SUPERJET("Superjet"), TU("Ту"), YAK("Як"), BE("Бе"), AN("Ан"), IL("Ил");

	private String name;

	AircraftBrand(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}
