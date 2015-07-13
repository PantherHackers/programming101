import java.acme.turtle;

public class MakeSquare{
	public static void main(String args[]){
		MakeSquare square = new MakeSquare();
		square.move();	
	}

	public move(){
		turtle t = new turtle();
	
		int widthOfBox = 200;
		int heightOfBox = 200;
		
		while(true){
			int currentX = t.getX();
			int currentY = t.getY();
			
			if(currentX <= 0 || currentX <= widthOfBox){
				t.forward(widthOfBox);
				t.left(90);
			}
			
			if(currentY <= 0 || currentY <= widthOfBox){
				t.forward(heightOfBox);
				t.left(90);
			}
		}
	}
}
