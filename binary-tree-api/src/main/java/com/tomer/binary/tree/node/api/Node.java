package com.tomer.binary.tree.node.api;

/**
 * @author Tomer Cohen
 */
public interface Node<K extends Comparable<K>, T> {
    K getKey();

    T getValue();

    boolean isLeaf();

    boolean isRoot();
}
