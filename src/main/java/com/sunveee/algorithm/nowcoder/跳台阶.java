package com.sunveee.algorithm.nowcoder;

/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 * 
 * @author 51
 * @version $Id: 跳台阶.java, v 0.1 2018年3月20日 上午8:53:39 51 Exp $
 */
public class 跳台阶 {

    public int JumpFloor(int target) {
        if (target == 1) {
            return 1;
        }
        if (target == 2) {
            return 2;
        }
        return JumpFloor(target - 1) + JumpFloor(target - 2);

    }

}
