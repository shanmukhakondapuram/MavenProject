package TestNG;

import org.testng.annotations.Test;

public class SampleTest {

		
		@Test
		public void PrintHello() {
			System.out.println("Sample Test is Executed");
		}
		@Test
		private void PrintNumbers() {
			System.out.println("Printing the numbers");
			System.out.println("GitHUb Commit - Printing the numbers");
		}

	

}
