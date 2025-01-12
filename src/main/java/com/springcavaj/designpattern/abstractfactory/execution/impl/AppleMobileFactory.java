/**
 * 
 */
package com.springcavaj.designpattern.abstractfactory.execution.impl;

import com.springcavaj.designpattern.abstractfactory.design.Mobile;
import com.springcavaj.designpattern.abstractfactory.design.Tablet;
import com.springcavaj.designpattern.abstractfactory.design.impl.AppleMobile;
import com.springcavaj.designpattern.abstractfactory.design.impl.AppleTablet;
import com.springcavaj.designpattern.abstractfactory.execution.MobileFactory;
import com.springcavaj.designpattern.abstractfactory.execution.TabletFactory;

/**
 * 
 * springcavaj
 */
public class AppleMobileFactory implements MobileFactory, TabletFactory {
	
	

	@Override
	public Mobile makeMobile() {
		return new AppleMobile();
	}

	@Override
	public Mobile playMobileGames() {
		return new AppleMobile();
	}

	@Override
	public Tablet playGames() {
		return new AppleTablet();
	}

}
