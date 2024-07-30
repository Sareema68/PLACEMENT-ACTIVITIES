package Static;

public class Static {

	static String msg = "Let use start coding";
	static int cnt=0;
	int i=0;
	
	public Static() {
		i++;
		cnt++;
	}

	
	public static void getData() {
		System.out.println(cnt);
	}
	
	@Override
	public String toString() {
		return "Static [i=" + i + "]";
	}
	
}
