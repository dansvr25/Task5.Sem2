package ru.vsu.cs.sviridov_d_v.ProjectFiles.bst;

import ru.vsu.cs.sviridov_d_v.ProjectFiles.BinaryTree;

public interface BSTree<T extends Comparable<? super T>> extends BinaryTree<T> {

    default BinaryTree.TreeNode<T> getNode(T value) {
        return BSTreeAlgorithms.getNode(getRoot(), value);
    }

    default T get(T value) {
        BinaryTree.TreeNode<T> valueNode = getNode(value);
        return (valueNode == null) ? null : valueNode.getValue();
    }

    default boolean contains(T value) {
        return getNode(value) != null;
    }

    T put(T value);

    T remove(T value);

    void clear();

    int size();
}

