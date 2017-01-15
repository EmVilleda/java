import processing.core.PApplet;

public class MyRect {
	
	PApplet p;
	
	public MyRect(){
	}
	
	public MyRect(PApplet p){
		this.p = p;
		
		 p.translate(p.width/2, p.height/2);
		 p.fill(255, 127, 30);
		 p.rect(-50, -100, 100, 200);
		
		
	}

}
