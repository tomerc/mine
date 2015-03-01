package com.tomer.binary.tree.redblack.api;

import com.tomer.binary.tree.node.api.BinaryNode;

/**
 * @author Tomer Cohen
 */
public interface RedBlackTree<K extends Comparable<K>, T> {
    void insert(BinaryNode<K, T> toInsert);

    BinaryNode<K, T> getRoot();
}
