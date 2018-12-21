package dalieOCP.interfaces._pratice;
/* 
 * Java 8
 *
import java.time.ZoneId;
import java.time.*;

interface I {
	
	LocalDateTime getLocalTime();
	
	default ZonedDateTime getZonedDateDatime(String z) {
		System.out.println("invoked default Methode of Interface");
		return ZonedDateTime.of(getLocalTime(), getZoneId(z));
	}
	
	static ZoneId getZoneId(String zoneId) {
		System.out.println("invoked static Methode of Interface");
		try {
			return ZoneId.of(zoneId);
		} catch (Exception e) {
			return ZoneId.systemDefault();
		}
	}
}

class A implements I{
	
	private LocalDateTime dateAndTime;
	
	A() {
		dateAndTime = LocalDateTime.now();
	}
	
	public LocalDateTime getLocalTime(){
		return dateAndTime;
	}
}

final class P01 {

	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.getLocalTime());
		System.out.println(a.getZonedDateDatime(I.getZoneId("America/New_York").getId()));
		System.out.println(a.getZonedDateDatime("Europe/London"));
	}
}
**/