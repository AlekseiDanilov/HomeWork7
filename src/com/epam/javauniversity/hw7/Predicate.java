package com.epam.javauniversity.hw7;

import java.util.Base64;

public interface Predicate<T> {
    public <U extends T> boolean apply(U value);
}
