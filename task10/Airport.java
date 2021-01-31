package by.training.cls.task10;

public enum Airport {
	DME("Domodedovo International Airport", "Moscow, Russia"),
	SVO("Sheremetyevo International Airport", "Moscow, Russia"),
	VKO("Vnukovo International Airport", "Moscow, Russia"),
	LED("Pulkovo Airport", "Saint Petersburg, Russia"),
	MHP("Minsk-1 Airport", "Minsk, Belarus"),
	MSQ("Minsk National Airport (Minsk-2)", "Minsk, Belarus");
	
	private String name;
	private String location;
	
	Airport (String name, String location) {
		this.name = name;
		this.location = location;
	}

	public String getName() {
		return name;
	}

	public String getLocation() {
		return location;
	}
	
}
