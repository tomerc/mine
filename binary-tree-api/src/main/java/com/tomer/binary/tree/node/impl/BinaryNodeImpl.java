package com.tomer.binary.tree.node.impl;

import com.tomer.binary.tree.node.api.BinaryNode;
import com.tomer.binary.tree.node.api.MutableBinaryNode;

/**
 * @author Tomer Cohen
 */
public class BinaryNodeImpl<K extends Comparable<K>, T> implements MutableBinaryNode<K, T> {

    private final T value;
    private final K key;
    private BinaryNode<K, T> parent;
    private BinaryNode<K, T> leftNode;
    private BinaryNode<K, T> rightNode;

    public BinaryNodeImpl(K key, T value) {
        this.value = value;
        this.key = key;
    }

    @Override
    public void setParent(BinaryNode<K, T> parent) {
        this.parent = parent;
    }

    @Override
    public void setLeftNode(BinaryNode<K, T> leftNode) {
        this.leftNode = leftNode;
    }

    @Override
    public void setRightNode(BinaryNode<K, T> rightNode) {
        this.rightNode = rightNode;
    }

    @Override
    public BinaryNode<K, T> getParent() {
        return parent;
    }

    @Override
    public BinaryNode<K, T> getLeftNode() {
        return leftNode;
    }

    @Override
    public BinaryNode<K, T> getRightNode() {
        return rightNode;
    }

    @Override
    public boolean isLeaf() {
        return getLeftNode() == null && getRightNode() == null;
    }

    @Override
    public boolean isParent() {
        return getParent() == null;
    }

    @Override
    public MutableBinaryNode<K, T> toMutable() {
        return this;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public T getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BinaryNodeImpl<?, ?> that = (BinaryNodeImpl<?, ?>) o;

        return key.equals(that.key);

    }

    @Override
    public int hashCode() {
        return key.hashCode();
    }
}
