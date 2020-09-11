package headfirst.designpatterns.c12_compound.djview_heartview;
  
public interface ControllerInterface {
	void start();
	void stop();
	void increaseBPM();
	void decreaseBPM();
 	void setBPM(int bpm);
}
