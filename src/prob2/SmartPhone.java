package prob2;

public class SmartPhone extends MusicPhone {
	@Override
	public void playMusic() {
		System.out.println("다운로드해서 음악재생");
	}
	//이중상속 보충
	//이 과정
	
	@Override 
	public void execute( String function ) {
		if ( function.equals("앱") ) {
			playApp();
			return;
		}
		
		super.execute( function );
	}
	
	protected void playApp() {
		System.out.println("앱실행");
	}
}
