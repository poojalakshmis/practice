import java.util.ArrayList;

public class Phone {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String ip = "play boy obed";
		char x = 0;
		for (int i = 0; i < ip.length(); i++) {
			x = ip.charAt(i);

			ArrayList<Character> Two = new ArrayList<Character>();
			Two.add('a');
			Two.add('b');
			Two.add('c');
			ArrayList<Character> Three = new ArrayList<Character>();
			Three.add('d');
			Three.add('e');
			Three.add('f');

			ArrayList<Character> four = new ArrayList<Character>();
			four.add('g');
			four.add('h');
			four.add('i');

			ArrayList<Character> five = new ArrayList<Character>();
			five.add('j');
			five.add('k');
			five.add('l');

			ArrayList<Character> six = new ArrayList<Character>();
			six.add('m');
			six.add('n');
			six.add('o');

			ArrayList<Character> seven = new ArrayList<Character>();
			seven.add('p');
			seven.add('q');
			seven.add('r');
			seven.add('s');

			ArrayList<Character> eight = new ArrayList<Character>();
			eight.add('t');
			eight.add('u');
			eight.add('v');
			ArrayList<Character> nine = new ArrayList<Character>();
			nine.add('w');
			nine.add('x');
			nine.add('y');
			nine.add('z');

			if (Two.contains(x)) {
				int s = Two.indexOf(x);
				s = s + 1;
				for (int i1 = 0; i1 < s; i1++) {

					System.out.println(2);
				}

			}

			else if (Three.contains(x)) {
				int t = Three.indexOf(x);
				t = t + 1;
				for (int i1 = 0; i1 < t; i1++) {

					System.out.println(3);
				}

			}

			else if (four.contains(x)) {
				int s = four.indexOf(x);
				s = s + 1;
				for (int i1 = 0; i1 < s; i1++) {

					System.out.println(4);
				}

			}

			else if (five.contains(x)) {
				int s = five.indexOf(x);
				s = s + 1;
				for (int i1 = 0; i1 < s; i1++) {

					System.out.println(5);
				}

			} else if (six.contains(x)) {
				int s = six.indexOf(x);
				s = s + 1;
				for (int i1 = 0; i1 < s; i1++) {

					System.out.println(6);
				}

			} else if (seven.contains(x)) {
				int s = seven.indexOf(x);
				s = s + 1;
				for (int i1 = 0; i1 < s; i1++) {

					System.out.println(7);
				}

			}

			else if (eight.contains(x)) {
				int s = eight.indexOf(x);
				s = s + 1;
				for (int i1 = 0; i1 < s; i1++) {

					System.out.println(8);
				}

			} else if (nine.contains(x)) {
				int s = nine.indexOf(x);
				s = s + 1;
				for (int i1 = 0; i1 < s; i1++) {

					System.out.println(9);
				}

			} else if (x == 32) {
				System.out.println(0);
			} else {
				System.out.println("Enter valid word");
			}

		}

		// TODO Auto-generated method stub

	}

}
