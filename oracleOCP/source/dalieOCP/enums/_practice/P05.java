package dalieOCP.enums._practice;
import static java.lang.System.out;

interface expanse {
	double calculate(double a, double b);
}

enum Figur implements expanse {

	A {
		public double calculate(double a, double b) {
			return a * b;
		}
	},
	B {
		public double calculate(double a, double b) {
			return a * b / 2;
		}
	},
	C {
		public double calculate(double a, double b) {
			return a * b * Math.PI / 4;
		}
	};
}

public class P05 {
	public static void main(String[] args) {
		out.printf("summary %,.2f %n", Figur.A.calculate(20000, 4));
		out.printf("summary %,.2f %n", Figur.B.calculate(2, 4));
		out.printf("summary %,.2f %n", Figur.C.calculate(2, 4));
	}
}
