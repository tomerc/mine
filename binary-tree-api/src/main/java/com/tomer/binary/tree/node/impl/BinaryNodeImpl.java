package com.tomer.binary.tree.node.impl;

import com.tomer.binary.tree.node.api.BinaryNode;
import com.tomer.binary.tree.node.api.MutableBinaryNode;

/**
 * @author Tomer Cohen
 */
public class BinaryNodeImpl<T> implements MutableBinaryNode<Integer, T> {

    private final T value;
    private final Integer key;
    private BinaryNode<Integer, T> parent;
    private BinaryNode<Integer, T> leftNode;
    private BinaryNode<Integer, T> rightNode;

    public BinaryNodeImpl(Integer key, T value) {
        this.value = value;
        this.key = key;
    }

    @Override
    public void setParent(BinaryNode<Integer, T> parent) {
        this.parent = parent;
    }

    @Override
    public void setLeftNode(BinaryNode<Integer, T> leftNode) {
        this.leftNode = leftNode;
    }

    @Override
    public void setRightNode(BinaryNode<Integer, T> rightNode) {
        this.rightNode = rightNode;
    }

    @Override
    public BinaryNode<Integer, T> getParent() {
        return parent;
    }

    @Override
    public BinaryNode<Integer, T> getLeftNode() {
        return leftNode;
    }

    @Override
    public BinaryNode<Integer, T> getRightNode() {
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
    public MutableBinaryNode<Integer, T> toMutable() {
        return this;
    }

    @Override
    public Integer getKey() {
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

        BinaryNodeImpl<?> that = (BinaryNodeImpl<?>) o;

        return key.equals(that.key);

    }

    @Override
    public int hashCode() {
        return key.hashCode();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BinaryNodeImpl{");
        sb.append("value=").append(value);
        sb.append(", key=").append(key);
        sb.append('}');
        return sb.toString();
    }
}
