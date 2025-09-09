package com.tomer.binary.tree.redblack.impl;

import com.tomer.binary.tree.redblack.api.RedBlackTree;
import com.tomer.binary.tree.redblack.node.RedBlackNode;

/**
 * @author Tomer Cohen
 */
public class RedBlackTreeImpl<K extends Comparable<K>, T> implements RedBlackTree<K, T> {

    private RedBlackNode<K, T> root;

    public RedBlackTreeImpl() {
        this.root = null;
    }

    @Override
    public void insert(RedBlackNode<K, T> toInsert) {
        if (root == null) {
            root = toInsert;
        } else {
            // TODO: Implement proper insertion logic
        }
    }

    @Override
    public RedBlackNode<K, T> getRoot() {
        return root;
    }
}
