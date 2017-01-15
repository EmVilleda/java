
import processing.core.*; 

public class myEllipse {

	// default cstr
	public myEllipse() {
	}

	// overloaded cstr
	public myEllipse(PApplet p) {
		p.translate(p.width / 2, p.height / 2);

		for (int i = 0; i < 2000; i++) {
			float sz = p.random(1, 10);
			float theta = p.random(p.TWO_PI);
			float r = p.random(150);
			p.ellipse(p.cos(theta) * r, p.sin(theta) * r, sz, sz);
		}
	}

}
