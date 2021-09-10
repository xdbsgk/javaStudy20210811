package b15_인터페이스;

public class LGRemoteControl {
	private Switch powerSwitch = new SwitchImpl();
	private Switch volumeSwitch = new SwitchImpl2();
	
	public LGRemoteControl() {
		
	}
	
	public void powerSwitchController(int flag) {
		
		if(flag == 1) {
			powerSwitch.on();
		}else if(flag == 0) {
			powerSwitch.off();
		}else {
			System.out.println("잘못된 값을 전달받았습니다.");
		}
	}

}
