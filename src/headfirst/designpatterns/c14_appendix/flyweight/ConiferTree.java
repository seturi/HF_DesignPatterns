package headfirst.designpatterns.c14_appendix.flyweight;

public class ConiferTree implements Tree {
	// Complex trunk, branch, needle graphic data
	public void display(int x, int y) {
		System.out.println("Conifer tree is located at " + x + ", " + y);
	}
}