package com.example.linkedlist;

public interface LinkedList<E> {

    void addFirst(E element);
    void addLast(E element);

    E pollFirst();
    E pollLast();

    E peekFirst();
    E peekLast();

