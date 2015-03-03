package com.tomer.binary.tree.redblack.api;

import com.tomer.binary.tree.redblack.node.RedBlackNode;

/**
 * @author Tomer Cohen
 */
public interface RedBlackTree<K extends Comparable<K>, T> {
    void insert(RedBlackNode<K, T> toInsert);

    RedBlackNode<K, T> getRoot();
}
