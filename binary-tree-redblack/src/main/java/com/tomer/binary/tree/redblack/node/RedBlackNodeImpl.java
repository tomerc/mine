package com.tomer.binary.tree.redblack.node;

import com.tomer.binary.tree.node.impl.BinaryNodeImpl;

/**
 * @author Tomer Cohen
 */
public class RedBlackNodeImpl<T> extends BinaryNodeImpl<T> implements MutableRedBlackNode<Integer, T> {
    private Color color;

    public RedBlackNodeImpl(Integer key, T value, Color color) {
        super(key, value);
        this.color = color;
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }
}
