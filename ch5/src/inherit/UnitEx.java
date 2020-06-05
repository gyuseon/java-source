package inherit;

public class UnitEx {

	public static void main(String[] args) {
		Marin marin =new Marin();
		
		marin.move(2, 2);
		marin.stop();
		marin.stimPack();
		
		
		Tank T=new Tank();
		
		T.move(2, 2);
		T.stop();
		T.changeMode();
		
		Dropship D=new Dropship();
		
		D.move(2, 2);
		D.stop();
		D.load();
		D.upload();

	}

}
