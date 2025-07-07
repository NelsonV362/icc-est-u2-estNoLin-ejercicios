package main.Ejercicio_02_invert;

import main.Materia.Models.Node;


public class InvertBinaryTree {

    /**
     * Invierte recursivamente un árbol binario.
     *
     * @param root nodo raíz del árbol
     * @return el árbol binario invertido
     */
    public Node invertTree(Node root) {
        if (root == null) return null;Node temp = root.getLeft();
        root.setLeft(invertTree(root.getRight()));root.setRight(invertTree(temp));

        return root;
    }
}
