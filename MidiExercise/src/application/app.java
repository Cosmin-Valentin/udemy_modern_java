package application;

import java.util.List;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.ShortMessage;
import static application.Cord.Type.*;

public class app {

	public static void main(String[] args)
			throws MidiUnavailableException, InvalidMidiDataException, InterruptedException {

		var receiver = MidiSystem.getReceiver();

		// @formatter:off
		List<Cord> cords = List.of(
				new Cord(60, MAJOR), 
				new Cord(60, SUS4),
				new Cord(55, MAJOR),
				new Cord(55, SUS4),
				new Cord(53, MAJOR),
				new Cord(53, SUS4)
		);
		// @formatter:on

		int time = 0;
		for (var cord : cords) {
			for (var note : cord) {
				receiver.send(new ShortMessage(ShortMessage.NOTE_ON, 0, note, 127), time * 1_000_000);
				receiver.send(new ShortMessage(ShortMessage.NOTE_OFF, 0, note, 127), (time + 1) * 1_000_000);
			}
			time++;
		}
		
		Thread.sleep(3000);
	}
}
