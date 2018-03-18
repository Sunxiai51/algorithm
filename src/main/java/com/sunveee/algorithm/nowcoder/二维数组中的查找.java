package com.sunveee.algorithm.nowcoder;

/**
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 * 
 * @author 51Sun
 *
 */
public class 二维数组中的查找 {
	/**
	 * 递归
	 * 
	 * @param target
	 * @param array
	 * @return
	 */
	public boolean result_1(int target, int[][] array) {
		return _find(target, array, 0, 0, array.length - 1, array[0].length - 1);
	}

	/**
	 * 循环
	 * 
	 * @param target
	 * @param array
	 * @return
	 */
	public boolean result_2(int target, int[][] array) {
		int len = array.length - 1;
		int i = 0;
		while ((len >= 0) && (i < array[0].length)) {
			if (array[len][i] > target) {
				len--;
			} else if (array[len][i] < target) {
				i++;
			} else {
				return true;
			}
		}
		return false;
	}

	public boolean _find(int t, int[][] a, int h1, int w1, int h2, int w2) {
		if (h1 > h2 || w1 > w2) { // 负集
			return false;
		}
		if (t < a[h1][w1] || t > a[h2][w2]) { // 如果小于左上角或大于右下角，不存在
			return false;
		} else if (t == a[h1][w1] || t == a[h2][w2]) { // 如果等于左上角或等于右下角，返回true
			return true;
		} else {
			int mh = (h1 + h2) / 2, mw = (w1 + w2) / 2; // 中点为a[mh][mw]
			if (t == a[mh][mw]) {
				return true;
			} else if (t > a[mh][mw]) { // 大于中点，在中点的整个下边和右上边找
				return _find(t, a, mh + 1, w1, h2, w2) || _find(t, a, h1, mw + 1, mh, w2);
			} else { // 小于中点，在中点的整个上边和左下边找
				return _find(t, a, h1, w1, mh - 1, w2) || _find(t, a, h1, mh, h2, mw - 1);
			}
		}
	}

}
