package com.test;

import java.util.Arrays;

public class Exercise4 {

	public static void main(String[] args) {
		// Do a Replace Formula
		// Apply the formula on funded 0
		int[][] _MxNarray = { { 1, 2, 3 }, { 3, 1, 4 }, { 5, 6, 0 } };
		//tested with different 0 on places
		//only work with one zero

		_MxNarray = findInArray(0, _MxNarray);
		System.out.println(Arrays.deepToString(_MxNarray));
		

	}

	private static int[][] findInArray(int i, int[][] _MxNarray) {
		for (int x = 0; x < _MxNarray.length ; x++) {
			for (int y = 0; y < _MxNarray[x].length ; y++) {
				if (0 == _MxNarray[x][y]) {
					return replaceAllwithMatch(_MxNarray, x, y);
					
					
				}
			}
		}
		return _MxNarray;

	}

	private static int[][] replaceAllwithMatch(int[][] _MxNarray, int fixX, int fixY) {

		for (int x = 0; x < _MxNarray.length ; x++) {
			_MxNarray[x][fixY] = 0;
		}
		for (int y = 0; y < _MxNarray[fixY].length ; y++) {
			_MxNarray[fixX][y] = 0;
		}

		return _MxNarray;

	}

}
