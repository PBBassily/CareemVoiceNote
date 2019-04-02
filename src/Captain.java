public class Captain {

	private BusLine line;
	
	public void setBusLine(BusLine line) {
		this.line = line;
	}
	
	
	public void sendVoiceNote(VoiceNote note) {
		APIClient.send(note);
	}

	public VoiceNote recordVoiceNote() {
		VoiceNote note;
		try {
			note = new SoundRecorder().recordVoice();
		} catch (Exception e) {
			return null;
		}
		return note;
	}

	public BusStop currentBusStop() {
		return line.getCurrentBusStop();
	}

}
