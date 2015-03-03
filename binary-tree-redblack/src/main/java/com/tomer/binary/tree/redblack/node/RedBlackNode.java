package com.tomer.binary.tree.redblack.node;

import com.tomer.binary.tree.node.api.BinaryNode;

/**
 * @author Tomer Cohen
 */
public interface RedBlackNode<K extends Comparable<K>, T> extends BinaryNode<K, T> {
    Color getColor();
}
