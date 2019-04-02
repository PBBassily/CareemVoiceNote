import java.util.List;


public class BusLine {

	private List<BusStop> stops;
	private int index;
	public BusLine(List<BusStop> stops) {
		this.stops = stops;
		index= 0;
	}
	
	public void movedToNextStop() {
		index++;
	}
	
	public BusStop getCurrentBusStop() {
		return stops.get(index);
	}
	
}
