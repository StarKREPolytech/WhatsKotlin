package java;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class Person {

    public final void say(@NotNull String message) {
        Intrinsics.checkParameterIsNotNull(message, "message");
        System.out.println(message);
    }
}



