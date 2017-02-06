import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class LearnHashMp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ip = "obed obed pooja obed pooja pooja banana pooja";
		StringTokenizer r = new StringTokenizer(ip);
		int ctr = 1;
		int i = r.countTokens();

		HashMap<String, Integer> m = new HashMap<String, Integer>();

		while (r.hasMoreTokens()) {
			String s = r.nextToken();

			if (m.containsKey(s))

			{

				int x = m.get(s);
				m.remove(x);
				m.put(s, x + 1);
			} else {
				m.put(s, ctr);
			}
		}

		for (Object key : m.keySet()) {

			System.out.println(key + "count" + m.get(key));
		}
	}
}
