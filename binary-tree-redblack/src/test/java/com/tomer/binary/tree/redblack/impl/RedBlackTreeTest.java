package com.tomer.binary.tree.redblack.impl;

import com.tomer.binary.tree.node.api.BinaryNode;
import com.tomer.binary.tree.node.impl.BinaryNodeImpl;
import com.tomer.binary.tree.redblack.api.RedBlackTree;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author Tomer Cohen
 */
public class RedBlackTreeTest {

    @Test
    public void insert() {
        RedBlackTree<Integer, String> redBlackTree = new RedBlackTreeImpl<>();
        BinaryNode<Integer, String> toInsert = new BinaryNodeImpl<>(1, "blabla");
        redBlackTree.insert(toInsert);

        Assert.assertEquals(redBlackTree.getRoot(), toInsert);

    }
}
