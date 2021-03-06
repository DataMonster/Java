package com.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class test3 {

	static Map<Integer, Double> calculateFinalScores(List<TestResult> results) {
		Map<Integer, ArrayList<Integer>> allscore = new HashMap<Integer, ArrayList<Integer>>();
		// to store the student and all his/her score pairs, integer-array also
		// works but
		// the total number of scores if unknow, arraylist is better for size
		// changing.
		for (TestResult re : results) {
			if (allscore.containsKey(re.studentId)) {
				allscore.get(re.studentId).add(re.testScore);
			} else {
				ArrayList<Integer> scores = new ArrayList<Integer>();
				scores.add(re.testScore);
				allscore.put(re.studentId, scores);
			}
		}

		// Convert ArrayList scores to array and sort them, get the average best
		// 5 score.
		Map<Integer, Double> result = new HashMap<Integer, Double>();
		for (Integer key : allscore.keySet()) {
			Object[] arr = allscore.get(key).toArray();
			Arrays.sort(arr);
			int i = arr.length - 1;
			int sum = 0;
			while (i > arr.length - 6) {
				sum = sum + (int) arr[i];

				i--;
			}
			double avg = (double) sum / 5;
			result.put(key, avg);
		}
		return result;
	}
	
	public static void main(String[] args) {
		List<TestResult> results = new LinkedList<TestResult>();
//
//		LinkedList<Integer> result = new LinkedList<Integer>();
//		result.add(3);
//		result.add(97);
//		result.add(77);
//		result.add(77);
//		result.add(79);
//		result.add(91);
//		Object[] arr = result.toArray();
//		Arrays.sort(arr);
//		int i = arr.length-1;
//		while(i>arr.length-6){
//		System.out.println(arr[i]);
//		i--;
		//}
		TestResult r1 = new TestResult(1,99);
		TestResult r2 = new TestResult(1,97);
		TestResult r3 = new TestResult(1,93);
		TestResult r4 = new TestResult(1,99);
		TestResult r5 = new TestResult(1,99);
		TestResult r6 = new TestResult(1,99);
		TestResult r7 = new TestResult(2,99);
		TestResult r8 = new TestResult(2,97);
		TestResult r9 = new TestResult(2,0);
		TestResult r10 = new TestResult(2,97);
		TestResult r11 = new TestResult(2,99);
		TestResult r12 = new TestResult(2,97);
		
		results.add(r1);
		results.add(r2);
		results.add(r3);
		results.add(r4);
		results.add(r5);
		results.add(r6);
		results.add(r7);
		results.add(r8);
		results.add(r9);
		results.add(r10);
		results.add(r11);
		results.add(r12);
		
		Map<Integer, Double> result = calculateFinalScores (results); 
		System.out.println(result.get(1));
		
	}

}

class TestResult {
    int studentId;
    String testDate;
    int testScore;
    TestResult(int i,int j){
    	this.studentId=i;
    	this.testScore =j;
    }
 }