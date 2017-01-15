import processing.core.*;

public class SphereWorld {
	PApplet p;

	public SphereWorld() {
	}

	public SphereWorld(PApplet p) {
		this.p = p;
		p.translate(p.width / 2, p.height / 2);
		p.lights();
		p.noStroke();
		p.fill(95, 10, 125);
		p.sphere(300);
		p.ellipse(0,  0,  300,  300);
	}

}
