package dvl_lab10;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class maxTest {

	@Test
	void test() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Lenght");
		int length = sc.nextInt();
		int[] arr1 = new int[length];
		System.out.println("Enter Array Elements");
		for (int i = 0 ; i < length ; i++) {
			System.out.println("Enter element"+(i+1));
		    arr1[i] = sc.nextInt();
		}
		Integer ob1 = new Integer();
		int maximum = ob1.maxInteger(arr1);
		System.out.println("Maximum Number "+maximum);
		assertEquals(8, maximum);
	}

}
