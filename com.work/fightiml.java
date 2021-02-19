package com.work;

import static java.lang.System.exit;

public class fightiml implements fight{
	@Override
	public void fightMethod(object a ,object b) {
	if(a.getLive()>=0&&b.getLive()>=0)	System.out.println("===========战斗详情===============");
	     a.setLive(a.getLive()+a.getDefence()-b.getAttack());
	     //打印战斗型
	if(b.getFlag()==0)	System.out.println(b.getName()+"对"+a.getName()+"造成了"+(b.getAttack()-a.getDefence()+"伤害\n"+"此时"+a.getName()+"剩下"+a.getLive())+"血量");
		if (a.getName()=="野猪骑士"&&a.getLive() < 25&&a.getFlag() == 0) {
			System.out.println("狡诈哥布林激怒愤怒了野猪野猪骑士\n野猪骑士化身愤怒猪神");
			System.out.println("愤怒野猪开始报复型进攻");
			a.setName("愤怒猪神");
			a.setAttack(10);
			a.setFlag(1);
		}
		if(a.getName()=="愤怒猪神"){
			b.setLive(b.getLive()-a.getAttack());
			if(b.getLive()>0) {
				System.out.println(a.getName() + "愤怒重锤对" + b.getName() + "造成" + a.getAttack() + "伤害" + b.getName() + "剩下" + b.getLive() + "血量");
			}else System.out.println(a.getName()+"敲烂"+b.getName()+"的小屋
"+b.getName()+"仓皇逃跑");
			System.out.println("======================================\n\n");
		}
		if (b.getName()=="狡诈哥布林"&&b.getLive() <= 0) {
			System.out.println("==============战斗结束===========");
			System.out.println("        "+a.getName() + "哈哈大笑,传递快乐");
			System.out.println("=====================================");
			exit(0);
		}
	}
}
