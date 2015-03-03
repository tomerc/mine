package com.tomer.binary.tree.redblack.impl;

import com.tomer.binary.tree.redblack.api.RedBlackTree;
import com.tomer.binary.tree.redblack.node.RedBlackNode;

/**
 * @author Tomer Cohen
 */
public class RedBlackTreeImpl<T> implements RedBlackTree<Integer, T> {

    private RedBlackNode<Integer, T> root;

    public RedBlackTreeImpl() {
        this.root = null;
    }

    @Override
    public void insert(RedBlackNode<Integer, T> toInsert) {
        if (root == null) {
            root = toInsert;
        } else {

        }
    }

    @Override
    public RedBlackNode<Integer, T> getRoot() {
        return root;
    }
}
