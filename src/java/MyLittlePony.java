package java;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class MyLittlePony {

    public static final void hello(String message) {
        System.out.println("Hello world!");
    }

    public static void hello$default(String message, int mask) {
        if ((mask & 1) != 0) {
            message = "Hello world!";
        }

        hello(message);
    }
}

