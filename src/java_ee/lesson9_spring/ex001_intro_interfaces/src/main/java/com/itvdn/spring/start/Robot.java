package main.java.com.itvdn.spring.start;

import main.java.com.itvdn.spring.objects.SonyHand;
import main.java.com.itvdn.spring.objects.SonyHead;
import main.java.com.itvdn.spring.objects.SonyLeg;

public class Robot {
	
	private SonyHand hand = new SonyHand();
	private SonyLeg leg = new SonyLeg();
	private SonyHead head = new SonyHead();
	
	public void action() {
		head.calc();
		hand.catchSomething();
		leg.go();
	}

}
