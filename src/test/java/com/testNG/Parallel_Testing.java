package com.testNG;

import org.testng.annotations.Test;

public class Parallel_Testing {
	
	@Test
	public void print1() {
		System.out.println("Ready");
	}

	@Test
	public void print2() {
		System.out.println("Steady");
	}
	
	@Test
	public void print3() {
		System.out.println("Go");
	}
}
