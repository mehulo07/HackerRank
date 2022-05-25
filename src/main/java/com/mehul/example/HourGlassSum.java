package com.mehul.example;

import java.util.ArrayList;
import java.util.List;

public class HourGlassSum {

	public static int hourglassSum(List<List<Integer>> arr) {

		int result = Integer.MIN_VALUE;
		for (int i = 0; i < arr.size() - 2; i++) {
			for (int j = 0; j < arr.get(i).size() - 2; j++) {
				int sum = arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2) + arr.get(i + 1).get(j + 1)
						+ arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2);

				result = Math.max(result, sum);
			}
		}
		return result;
	}

	public static void main(String[] args) {

		List<List<Integer>> arr = new ArrayList<>();

		List<Integer> innserList = new ArrayList<>();
		innserList.add(1);
		innserList.add(1);
		innserList.add(1);
		innserList.add(0);
		innserList.add(0);
		innserList.add(0);
		arr.add(innserList);

		innserList = new ArrayList<>();
		innserList.add(0);
		innserList.add(1);
		innserList.add(0);
		innserList.add(0);
		innserList.add(0);
		innserList.add(0);
		arr.add(innserList);

		innserList = new ArrayList<>();
		innserList.add(1);
		innserList.add(1);
		innserList.add(1);
		innserList.add(0);
		innserList.add(0);
		innserList.add(0);
		arr.add(innserList);

		innserList = new ArrayList<>();
		innserList.add(0);
		innserList.add(0);
		innserList.add(2);
		innserList.add(4);
		innserList.add(4);
		innserList.add(0);
		arr.add(innserList);

		innserList = new ArrayList<>();
		innserList.add(0);
		innserList.add(0);
		innserList.add(0);
		innserList.add(2);
		innserList.add(0);
		innserList.add(0);
		arr.add(innserList);

		innserList = new ArrayList<>();
		innserList.add(0);
		innserList.add(0);
		innserList.add(1);
		innserList.add(2);
		innserList.add(4);
		innserList.add(0);
		arr.add(innserList);

		int maxHourGlassSum = HourGlassSum.hourglassSum(arr);
		System.out.println("maxHourGlassSum : " + maxHourGlassSum);
	}

}
