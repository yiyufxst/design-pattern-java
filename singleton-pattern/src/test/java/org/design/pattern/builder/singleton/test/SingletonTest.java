package org.design.pattern.builder.singleton.test;

import org.design.pattern.builder.singleton.EnumSingleton;
import org.design.pattern.builder.singleton.StaticSingleton;
import org.junit.Test;

public class SingletonTest {
    @Test
    public void testEnumSingleton()
    {
        EnumSingleton.INSTANCE.whateverMethod();
    }
}
