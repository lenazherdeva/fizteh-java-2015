package ru.mipt.diht.students.lenazherdeva.CQL.impl.aggregators;
/*

import ru.mipt.diht.students.lenazherdeva.CQL.impl.aggregators.Aggregator;

import java.util.List;
import java.util.function.Function;

/**
 * Created by admin on 17.11.2015.

public class MinFunction<T, E extends Comparable<E>> implements Aggregator<T, E> {

    private Function<T, E> function;

    public MinFunction(Function<T, E> inpFunction) {
        this.function = inpFunction;
    }

    @Override
    public E apply(T t) {
        return null;
    }

    @Override
    public E applyOnList(List<T> list) {
        E result = null;
        for (T element : list) {
            if (result == null) {
                result = function.apply(element);
            } else {
                E currentResult = function.apply(element);
                if (currentResult.compareTo(result) < 0) {
                    result = currentResult;
                }
            }
        }
        return result;
    }
}

*/
