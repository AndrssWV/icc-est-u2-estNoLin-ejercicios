package main.Ejercicio_02_invert;

import main.Materia.Models.Node;

public class InvertBinaryTree {
    public Node invertTree(Node root) {
        if (root == null) return null;
        Node tempRight = invertTree(root.getRight());
        root.setRight(invertTree(root.getLeft()));
        root.setLeft(tempRight);
        return root;
    }
}
