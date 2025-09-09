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

    /**
     * Constructs a BinaryNodeImpl object with the specified key and value.
     *
     * @param key   the key of the node
     * @param value the value stored in the node
     * @throws IllegalArgumentException if key is null
     */
    public BinaryNodeImpl(K key, T value) {
        if (key == null) {
            throw new IllegalArgumentException("Key cannot be null");
        }
        this.value = value;
        this.key = key;
    }

    /**
     * Sets the parent node of this node.
     *
     * @param parent the parent node to set
     */
    @Override
    public void setParent(BinaryNode<K, T> parent) {
        this.parent = parent;
    }

    /**
     * Sets the left child node of this node.
     *
     * @param leftNode the left child node to set
     */
    @Override
    public void setLeftNode(BinaryNode<K, T> leftNode) {
        this.leftNode = leftNode;
    }

    /**
     * Sets the right child node of this node.
     *
     * @param rightNode the right child node to set
     */
    @Override
    public void setRightNode(BinaryNode<K, T> rightNode) {
        this.rightNode = rightNode;
    }

    /**
     * Returns the parent node of this node.
     *
     * @return the parent node, or null if this node is a root
     */
    @Override
    public BinaryNode<K, T> getParent() {
        return parent;
    }

    /**
     * Returns the left child node of this node.
     *
     * @return the left child node, or null if this node has no left child
     */
    @Override
    public BinaryNode<K, T> getLeftNode() {
        return leftNode;
    }

    /**
     * Returns the right child node of this node.
     *
     * @return the right child node, or null if this node has no right child
     */
    @Override
    public BinaryNode<K, T> getRightNode() {
        return rightNode;
    }

    /**
     * Checks if this node is a leaf node (has no children).
     *
     * @return true if this node is a leaf node, false otherwise
     */
    @Override
    public boolean isLeaf() {
        return getLeftNode() == null && getRightNode() == null;
    }

    /**
     * Checks if this node is a root node (has no parent).
     *
     * @return true if this node is a root node, false otherwise
     */
    @Override
    public boolean isRoot() {
        return getParent() == null;
    }

    /**
     * Returns a mutable version of this node.
     *
     * @return a mutable version of this node
     */
    @Override
    public MutableBinaryNode<K, T> toMutable() {
        return this;
    }

    /**
     * Returns the key of this node.
     *
     * @return the key of this node
     */
    @Override
    public K getKey() {
        return key;
    }

    /**
     * Returns the value stored in this node.
     *
     * @return the value stored in this node
     */
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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BinaryNodeImpl{");
        sb.append("value=").append(value);
        sb.append(", key=").append(key);
        sb.append('}');
        return sb.toString();
    }
}
