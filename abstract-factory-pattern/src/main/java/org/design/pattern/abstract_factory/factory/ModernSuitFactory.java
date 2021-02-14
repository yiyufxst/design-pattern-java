package org.design.pattern.abstract_factory.factory;

import org.design.pattern.abstract_factory.model.coat.Coat;
import org.design.pattern.abstract_factory.model.coat.ModernCoat;
import org.design.pattern.abstract_factory.model.hat.Hat;
import org.design.pattern.abstract_factory.model.hat.ModernHat;
import org.design.pattern.abstract_factory.model.pants.ModerPants;
import org.design.pattern.abstract_factory.model.pants.Pants;
import org.design.pattern.abstract_factory.model.shoes.ModernShoes;
import org.design.pattern.abstract_factory.model.shoes.Shoes;

/**
 * 现代风套装工厂
 */
public class ModernSuitFactory implements SuitFactory {
    @Override
    public Hat createHat() {
        return new ModernHat();
    }

    @Override
    public Coat createCoat() {
        return new ModernCoat();
    }

    @Override
    public Pants createPants() {
        return new ModerPants();
    }

    @Override
    public Shoes createShoes() {
        return new ModernShoes();
    }
}
