package com.javaee.algorithm;

public class NumTest {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {// 控制行号
			for (int j = 0; j < 10; j++) {// 控制内层输入结果
				if (i % 2 == 0) {// 如果是奇数行 第一行第三行
					System.out.printf("%4d ", i * 10 + j + 1);
				} else {// 偶数行 第二行 第四行
					System.out.printf("%4d ", (i + 1) * 10 - j);
				}
			}
			System.out.println("");
		}

	}

}