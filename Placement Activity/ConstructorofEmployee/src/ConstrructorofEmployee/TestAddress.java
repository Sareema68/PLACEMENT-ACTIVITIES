package ConstrructorofEmployee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestAddress {

	public static void main(String[] args) {
		
		Address ad = new Address();
		
		// start buffer reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter Society Name: ");
		String sname;
		try {
			sname = br.readLine();
			ad.setSocityName(sname);
			
			System.out.println("Enter Pincode: ");
			int pin = Integer.parseInt(br.readLine());
			ad.setPincode(pin);
			System.out.println(ad);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// end buffer reader
		
		//System.out.println(ad);
		
		//called parameter wise constructor
		Address ad1 = new Address("dfg","rty",1234);
		System.out.println(ad1);
		//end
		
	}
	

}
