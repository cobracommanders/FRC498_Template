package org.usfirst.frc.team498.robot;

public class AutonomousController implements IComponent{

	Drive drive;
	AutonomousType currentAuto;
	int phase;
	AutonomousController(Drive mainDrive, Ports ports) {
		drive = mainDrive;
		phase = 0;
	}
	
	
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
		switch (currentAuto) {
			case Option1 :
				AutoOption1();
				break;
			case Option2 :
				AutoOption2();
				break;
			case Option3 :
				AutoOption3();
				break;
			
		}
	}
	//TODO Add actual autonomous modes
	private void AutoOption1() {
		/*switch (phase) {
			case 0:
				OPERATION TO PERFORM
				if(CONDITION) {
					phase++;
				}
				break;
			case 1:
				OPERATION TO PERFORM
				if(CONDITION) {
					phase++;
				}
				break;
		}
	} */
	
	private void AutoOption2() {
		/*switch (phase) {
		case 0:
			OPERATION TO PERFORM
			if(CONDITION) {
				phase++;
			}
			break;
		case 1:
			OPERATION TO PERFORM
			if(CONDITION) {
				phase++;
			}
			break;
	}
} */
	}
	
	private void AutoOption3() {
		/*switch (phase) {
		case 0:
			OPERATION TO PERFORM
			if(CONDITION) {
				phase++;
			}
			break;
		case 1:
			OPERATION TO PERFORM
			if(CONDITION) {
				phase++;
			}
			break;
	}
} */
	}

}
