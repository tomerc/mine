package com.tomer.binary.tree.node.api;

/**
 * @author Tomer Cohen
 */
public interface BinaryNode<K extends Comparable, T> extends Node<K, T> {
    BinaryNode<K, T> getParent();

    BinaryNode<K, T> getLeftNode();

    BinaryNode<K, T> getRightNode();

    MutableBinaryNode<K, T> toMutable();
}
