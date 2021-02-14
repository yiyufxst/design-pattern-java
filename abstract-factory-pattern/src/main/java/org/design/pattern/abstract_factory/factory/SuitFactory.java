package org.design.pattern.abstract_factory.factory;

import org.design.pattern.abstract_factory.model.coat.Coat;
import org.design.pattern.abstract_factory.model.hat.Hat;
import org.design.pattern.abstract_factory.model.pants.Pants;
import org.design.pattern.abstract_factory.model.shoes.Shoes;

/**
 * 套装工厂
 */
public interface SuitFactory {
    Hat createHat();
    Coat createCoat();
    Pants createPants();
    Shoes createShoes();
}
