package game.demo;

import java.util.Scanner;

public class GameApp {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		int size = 20;
		int cellNum = 20;
		System.out.println("请输入矩阵大小（如：40,默认20）：");
		size = sc.nextInt();
		System.out.println("请输入初始细胞数量（如：20,默认40）：");
		cellNum = sc.nextInt();
		CellWorld cw = new CellWorld(size, cellNum);
		cw.run();
	}

}
