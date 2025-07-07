package main.Ejercicio_03_listLeves;

import main.Materia.Models.Node;
import java.util.*;

public class ListLevels {

    /**
     * Devuelve una lista de listas, donde cada sublista representa un nivel del árbol.
     *
     * @param root la raíz del árbol binario
     * @return lista de niveles (cada nivel es una lista de nodos)
     */
    public List<List<Node>> listLevels(Node root) {
        List<List<Node>> result = new ArrayList<>();
        if (root == null) return result; Queue<Node> queue = new LinkedList<>();
        queue.offer(root);while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Node> level = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                Node current = queue.poll();
                level.add(current);
                if (current.getLeft() != null) queue.offer(current.getLeft());
                if (current.getRight() != null) queue.offer(current.getRight());
            }


            result.
            add(level);
        }

        return result;
    }
}
