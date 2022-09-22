package ru.vichukano.my.java.notes.patterns.singleton;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SingletonTest {

    @Test
    void singletons() {
        var classicSingleton = ClassicSingleton.getInstance();
        var enumSingleton = EnumSingleton.INSTANCE;
        var dcls = DoubleCheckedLockedSingleton.getInstance();
        var odhs = OnDemandHolderSingleton.getInstance();

        Assertions.assertThat(classicSingleton.getInfo()).isEqualTo("non thread safe");
        Assertions.assertThat(enumSingleton.getInfo()).isEqualTo("Enum singleton");
        Assertions.assertThat(dcls.getInfo()).isEqualTo("Thread safe singleton");
        Assertions.assertThat(odhs.getInfo()).isEqualTo("Thread safe singleton");
    }

}