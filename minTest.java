package dvl_lab10;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

class minTest {

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
		int minimum = ob1.minInteger(arr1);
		System.out.println("Minimum Number "+minimum);
		assertEquals(3, minimum);
	}
	}

