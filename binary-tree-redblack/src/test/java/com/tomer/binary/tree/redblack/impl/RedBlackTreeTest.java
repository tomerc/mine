package com.tomer.binary.tree.redblack.impl;

import com.tomer.binary.tree.redblack.api.RedBlackTree;
import com.tomer.binary.tree.redblack.node.Color;
import com.tomer.binary.tree.redblack.node.RedBlackNode;
import com.tomer.binary.tree.redblack.node.RedBlackNodeImpl;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author Tomer Cohen
 */
public class RedBlackTreeTest {

    @Test
    public void insert() {
        RedBlackTree<Integer, String> redBlackTree = new RedBlackTreeImpl<>();
        RedBlackNode<Integer, String> toInsert = new RedBlackNodeImpl<>(1, "blabla", Color.BLACK);
        redBlackTree.insert(toInsert);

        Assert.assertEquals(redBlackTree.getRoot(), toInsert);

    }
}
