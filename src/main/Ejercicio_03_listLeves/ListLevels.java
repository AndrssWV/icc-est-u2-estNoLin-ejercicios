package main.Ejercicio_03_listLeves;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import main.Materia.Models.Node;

public class ListLevels {
    public List<List<Node>> listLevels(Node root) {
        List<List<Node>> levels = new LinkedList<>();
        if (root == null) return levels;
        Queue<Node> nodes = new ArrayDeque<>();
        nodes.add(root);
        while (!nodes.isEmpty()) {
            int size = nodes.size();
            List<Node> level = new LinkedList<>();
            for (int i = 0; i < size; i++) {
                Node node = nodes.poll();
                level.add(node);
                if (node.getLeft() != null) nodes.add(node.getLeft());
                if (node.getRight() != null) nodes.add(node.getRight());
            }
            levels.add(level);
        }
        return levels;
    }
}
