package com.work;

public class object {
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String name;
    private int live;
    private int attack;
    private int defence = 0;

	public int getFlag() {
		return flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}

	private int flag = 0;


	public int getDefence() {
		return defence;
	}

	public void setDefence(int defence) {
		this.defence = defence;
	}

	public object(String name, int live, int attack, int defence ,int flag) {
		this.name = name;
		this.live = live;
		this.attack = attack;
		this.defence = defence;
		this.flag =flag;
	}

	public int getLive() {
		return live;
	}

	public void setLive(int live) {
		this.live = live;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getAttack() {
		return attack;
	}
}

