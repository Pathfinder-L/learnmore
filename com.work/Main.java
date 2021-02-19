package com.work;

public class Main {
	public static void main(String[] args) {
		object a = new object("野猪骑士", 50, 5, 2 ,0);
		object b = new object("狡诈哥布林", 30, 8, 0 ,0);
		fightiml fight = new fightiml();
		do {
			fight.fightMethod(a, b);
		    fight.fightMethod(b,a);
		} while (a.getLive() >= 0 && b.getLive() >= 0);
	}
}
