import java.io.Serializable;


public class VoiceNote implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Captain captain;
	private Object sound; // its type dependant of the recorder return type which is 3rd party in this project
	 
	public void setAuthor(Captain captain) {
		this.captain = captain;
	}
	public Captain getAuthor(){
		return captain;
	}
	
	public void save(Object sound) {
		// takes raw data of sound
	}
	
	public Object getSound() {
		return sound;
	}
}
