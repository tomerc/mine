package com.tomer.binary.tree.redblack.node;

import com.tomer.binary.tree.node.impl.BinaryNodeImpl;

/**
 * @author Tomer Cohen
 */
public class RedBlackNodeImpl<K extends Comparable<K>, T> extends BinaryNodeImpl<K, T> implements MutableRedBlackNode<K, T> {
    private Color color;

    /**
     * Constructs a RedBlackNodeImpl object with the specified key, value, and color.
     *
     * @param key   the key of the node
     * @param value the value stored in the node
     * @param color the color of the node
     * @throws IllegalArgumentException if key is null or color is null
     */
    public RedBlackNodeImpl(K key, T value, Color color) {
        super(key, value);
        if (color == null) {
            throw new IllegalArgumentException("Color cannot be null");
        }
        this.color = color;
    }

    /**
     * Returns the color of this node.
     *
     * @return the color of this node
     */
    @Override
    public Color getColor() {
        return color;
    }

    /**
     * Sets the color of this node.
     *
     * @param color the color to set
     * @throws IllegalArgumentException if color is null
     */
    @Override
    public void setColor(Color color) {
        if (color == null) {
            throw new IllegalArgumentException("Color cannot be null");
        }
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        RedBlackNodeImpl<?, ?> that = (RedBlackNodeImpl<?, ?>) o;

        return color == that.color;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (color != null ? color.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "RedBlackNodeImpl{" +
                "key=" + getKey() +
                ", value=" + getValue() +
                ", color=" + color +
                '}';
    }
}
