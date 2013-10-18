package net.randomsync.testng.excel.demo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DependencyTest {

	@Parameters({ "message" })
	@Test
	public void test1(String message) {
		System.out.println("message=" + message);

	}

}
