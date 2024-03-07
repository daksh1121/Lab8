package org.example;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class myStack<E> extends ArrayList<E> {

    private final ArrayList<E> delegate;

    public myStack() {
        delegate = this;
    }

    public void push(E e){
        delegate.add(e);
    }

    public E pop() {
        if (delegate.isEmpty()) throw new EmptyStackException();
        E e = delegate.get(delegate.size() -1);
        remove(delegate.size() -1);
        return e;
    }
}
