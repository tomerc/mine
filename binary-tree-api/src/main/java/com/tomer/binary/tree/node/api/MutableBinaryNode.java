package com.tomer.binary.tree.node.api;

/**
 * @author Tomer Cohen
 */
public interface MutableBinaryNode<K extends Comparable<K>, T> extends BinaryNode<K, T> {
    void setParent(BinaryNode<K, T> parent);

    void setLeftNode(BinaryNode<K, T> leftNode);

    void setRightNode(BinaryNode<K, T> rightNode);
}
