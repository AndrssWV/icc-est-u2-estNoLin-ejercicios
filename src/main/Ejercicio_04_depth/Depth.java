package main.Ejercicio_04_depth;

import main.Materia.Models.Node;

public class Depth {
    public int maxDepth(Node root) {
        if (root == null) return 0;
        int l = maxDepth(root.getLeft())+1;
        int r = maxDepth(root.getRight())+1;
        return l>r? l : r;
    }   
}
