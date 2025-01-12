package com.springcavaj.designpattern.abstractfactory.execution.impl;

import com.springcavaj.designpattern.abstractfactory.design.Mobile;
import com.springcavaj.designpattern.abstractfactory.design.Tablet;
import com.springcavaj.designpattern.abstractfactory.design.impl.SamsungMobile;
import com.springcavaj.designpattern.abstractfactory.design.impl.SamsungTablet;
import com.springcavaj.designpattern.abstractfactory.execution.MobileFactory;
import com.springcavaj.designpattern.abstractfactory.execution.TabletFactory;

public class SamsungMobileFactory implements MobileFactory, TabletFactory {

	@Override
	public Tablet playGames() {
		return new SamsungTablet();
	}

	@Override
	public Mobile makeMobile() {
		return new SamsungMobile();
	}

	@Override
	public Mobile playMobileGames() {
		return new SamsungMobile();
	}

}
