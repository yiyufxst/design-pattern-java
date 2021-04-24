package org.design.pattern.command;

import org.design.pattern.command.model.cook.Cook;
import org.design.pattern.command.model.cook.impl.ChiefCook;
import org.design.pattern.command.model.cook.impl.CustomCook;
import org.design.pattern.command.model.dish.Dish;
import org.design.pattern.command.model.dish.impl.BraisedIntestines;
import org.design.pattern.command.model.dish.impl.FriedPeanuts;
import org.design.pattern.command.model.dish.impl.LocalPotChicken;
import org.design.pattern.command.model.dish.impl.ShreddedCabbage;
import org.design.pattern.command.service.OrderService;
import org.design.pattern.command.service.impl.OrderServiceImpl;
import org.junit.Test;

public class OrderServiceTest {

    @Test
    public void testPlaceOrder() {
        Cook chiefCook = new ChiefCook();
        Cook customCook = new CustomCook();
        Dish braisedIntestines = new BraisedIntestines(chiefCook);
        Dish localPotChicken = new LocalPotChicken(chiefCook);
        Dish friedPeanuts = new FriedPeanuts(customCook);
        Dish shreddedCabbage = new ShreddedCabbage(customCook);

        OrderService orderService = new OrderServiceImpl();
        orderService.order(braisedIntestines);
        orderService.order(localPotChicken);
        orderService.order(friedPeanuts);
        orderService.order(shreddedCabbage);
        orderService.placeOrder();
    }
}
