/**
 * 
 */
package com.springcavaj.designpattern.abstractfactory.execution;

import com.springcavaj.designpattern.abstractfactory.design.Mobile;
import com.springcavaj.designpattern.abstractfactory.design.Tablet;

/**
 * springcavaj
 * 
 */
public interface MobileFactory {
	Mobile makeMobile();
	Mobile playMobileGames();
}
