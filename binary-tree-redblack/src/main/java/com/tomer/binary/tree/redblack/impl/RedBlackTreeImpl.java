package com.tomer.binary.tree.redblack.impl;

import com.tomer.binary.tree.node.api.BinaryNode;
import com.tomer.binary.tree.redblack.api.RedBlackTree;

/**
 * @author Tomer Cohen
 */
public class RedBlackTreeImpl<K extends Comparable, T> implements RedBlackTree<K, T> {

    private BinaryNode<K, T> root;

    public RedBlackTreeImpl() {
        this.root = null;
    }

    @Override
    public void insert(BinaryNode<K, T> toInsert) {
        if (root == null) {
            root = toInsert;
        }
    }

    @Override
    public BinaryNode<K, T> getRoot() {
        return root;
    }
}
