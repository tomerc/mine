package com.tomer.binary.tree.redblack.node;

import com.tomer.binary.tree.node.api.MutableBinaryNode;

/**
 * @author Tomer Cohen
 */
public interface MutableRedBlackNode<K extends Comparable<K>, T> extends RedBlackNode<K, T>, MutableBinaryNode<K, T> {
    void setColor(Color color);
}
