package gr.upatras.project.e1;

public class Subtract {
	public String subtract(int a, int b) {
		int c = a-b;
		
		if(c > 0) 
			return "POSITIVE";
		else if(c < 0)
			return "NEGATIVE";
		else 
			return "ZERO";
	}
}
