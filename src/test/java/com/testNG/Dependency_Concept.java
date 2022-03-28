package com.testNG;

import org.testng.annotations.Test;

public class Dependency_Concept {
	
	@Test
	public void eligibleToVote() {
		System.out.println("Eligible to vote");
	}

	@Test(dependsOnMethods = "eligibleToVote")
	public void vote() {
		System.out.println("Vote");
	}
	
}
