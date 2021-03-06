package ru.mipt.diht.students.lenazherdeva.CQL;

import java.util.Comparator;
import java.util.function.Function;

/**
 * Created by admin on 17.11.2015.
**/
public class OrderByConditions {

    public static <T, R extends Comparable<R>> Comparator<T> asc(Function<T, R> expression) {
        return (o1, o2) -> expression.apply(o1).compareTo(expression.apply(o2));
    }

    public static <T, R extends Comparable<R>> Comparator<T> desc(Function<T, R> expression) {
        return (o1, o2) -> expression.apply(o2).compareTo(expression.apply(o1));
    }
}

