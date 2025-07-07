package main.Ejercicio_01_insert;

import main.Materia.Models.Node;

public class InsertBST {

    /**
     * Inserta un valor en el árbol BST.
     *
     * @param root  raíz actual del árbol
     * @param value valor a insertar
     * @return la raíz actualizada con el nuevo nodo insertado
     */
    public Node insert(Node root, int value) {
        if (root == null) {
            return new Node(value);
        }

        if (value < root.getValue()) {
            root.setLeft(insert(root.getLeft(), value));
        } else {
            root.setRight(insert(root.getRight(), value));
        }

        return root;
    }
}
