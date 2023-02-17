package org.tnsif.usingrunnable;

import org.tnsif.threadlifecycle.SoftSkill;
import org.tnsif.threadlifecycle.Tech;

public class ThreadLifeCycleDemo {

	public static void main(String[] args) {
		Tech t=new Tech();
		SoftSkill s=new SoftSkill();
		t.start();
		//Move control to another thread
		t.yield();
		
		s.start();
	}

}
