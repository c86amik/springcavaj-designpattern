/**
 * 
 */
package com.springcavaj.designpattern.abstractfactory;

import com.springcavaj.designpattern.abstractfactory.design.Mobile;
import com.springcavaj.designpattern.abstractfactory.design.Tablet;
import com.springcavaj.designpattern.abstractfactory.execution.MobileFactory;
import com.springcavaj.designpattern.abstractfactory.execution.TabletFactory;
import com.springcavaj.designpattern.abstractfactory.execution.impl.AppleMobileFactory;
import com.springcavaj.designpattern.abstractfactory.execution.impl.SamsungMobileFactory;

/**
 * 
 * springcavaj
 */
public class AbstractFactoryMasterclassApplication {
	
	private Mobile mobile;
	private Tablet tablet;
	
	public AbstractFactoryMasterclassApplication(MobileFactory mobileFactory, TabletFactory tabletFactory) {
		mobile = mobileFactory.makeMobile();
		mobile = mobileFactory.playMobileGames();
		tablet = tabletFactory.playGames();
	}
	
	public void humanActivities() {
		mobile.makeCalls();
		mobile.playGames();
		tablet.playGames();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AppleMobileFactory appleMobileFactory = new AppleMobileFactory();
		AbstractFactoryMasterclassApplication abstractFactoryMasterclassApplication = new AbstractFactoryMasterclassApplication(appleMobileFactory, appleMobileFactory);
		abstractFactoryMasterclassApplication.humanActivities();
		
		SamsungMobileFactory samsungMobileFactory = new SamsungMobileFactory();
		abstractFactoryMasterclassApplication = new AbstractFactoryMasterclassApplication(samsungMobileFactory, samsungMobileFactory);
		abstractFactoryMasterclassApplication.humanActivities();
	}

}
