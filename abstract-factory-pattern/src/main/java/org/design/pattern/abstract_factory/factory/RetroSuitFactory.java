package org.design.pattern.abstract_factory.factory;

import org.design.pattern.abstract_factory.model.coat.Coat;
import org.design.pattern.abstract_factory.model.coat.RetroCoat;
import org.design.pattern.abstract_factory.model.hat.Hat;
import org.design.pattern.abstract_factory.model.hat.RetroHat;
import org.design.pattern.abstract_factory.model.pants.Pants;
import org.design.pattern.abstract_factory.model.pants.RetroPants;
import org.design.pattern.abstract_factory.model.shoes.RetroShoes;
import org.design.pattern.abstract_factory.model.shoes.Shoes;

/**
 * 复古风套装工厂
 */
public class RetroSuitFactory implements SuitFactory {
    @Override
    public Hat createHat() {
        return new RetroHat();
    }

    @Override
    public Coat createCoat() {
        return new RetroCoat();
    }

    @Override
    public Pants createPants() {
        return new RetroPants();
    }

    @Override
    public Shoes createShoes() {
        return new RetroShoes();
    }
}
