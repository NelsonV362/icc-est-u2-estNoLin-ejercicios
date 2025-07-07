package main;

import utils.StudentValidator;
import main.Materia.Models.Node;
import main.Ejercicio_01_insert.InsertBST;
import main.Ejercicio_02_invert.InvertBinaryTree;
import main.Ejercicio_03_listLeves.ListLevels;
import main.Ejercicio_04_depth.Depth;

import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        // NO MODIFICAR ESTE CÓDIGO
        var estudiante = StudentValidator.validarDatos();
        System.out.println("👤 Estudiante: " + estudiante.nombre());
        System.out.println("✉️  Correo: " + estudiante.correo());
        // NO MODIFICAR HASTA AQUÍ

        InsertBST inserter = new InsertBST();
        int[] valoresE1 = {5, 3, 7, 2, 4, 6, 8};
          Node rootE1 = null;
        for (int v : valoresE1) {
            rootE1 = inserter.insert(rootE1, v);}
        System.out.println("\nEjercicio 01: Árbol BST insertado");
          printTreeByLevels(rootE1);
        InvertBinaryTree inverter = new InvertBinaryTree();
        Node rootE2 = null;
        int[] valoresE2 = {4, 2, 7, 1, 3, 6, 9};
        for (int v : valoresE2) {
               rootE2 = inserter.insert(rootE2, v);
        }
        rootE2 = inverter.invertTree(rootE2);
        System.out.println("\nEjercicio 02: Árbol invertido");
        printTreeByLevels(rootE2);
        ListLevels listLevels = new ListLevels();
               Node rootE3 = null;
          for (int v : valoresE2) {
            rootE3 = inserter.insert(rootE3, v);
        }
        System.out.println("\nEjercicio 03: Listar niveles");
List<List<Node>> niveles = listLevels.listLevels(rootE3);
for (List<Node> nivel : niveles) {
    for (int i = 0; i < nivel.size(); i++) {
        System.out.print(nivel.get(i).getValue());
        if (i != nivel.size() - 1) System.out.print(" -> "); 
    }
    System.out.println();
}

        Depth depthCalc = new Depth();
        Node rootE4 = inserter.insert(null, 4);
        rootE4 = inserter.insert(rootE4, 2);
        rootE4 = inserter.insert(rootE4, 7);
            rootE4 = inserter.insert(rootE4, 1);
        rootE4 = inserter.insert(rootE4, 3);
         rootE4 = inserter.insert(rootE4, 8);
        System.out.println("\nEjercicio 04: Profundidad máxima");
         int profundidad = depthCalc.maxDepth(rootE4);
        System.out.println(profundidad);}
    public static void printTreeByLevels(Node root) {
        if (root == null) {
            System.out.println("(árbol vacío)");
    return;}
        List<List<Node>> niveles = new ListLevels().listLevels(root);
            int maxLevel = niveles.size();for (int i = 0; i < maxLevel; i++) {
               List<Node> nivel = niveles.get(i);
                  String espacios = " ".repeat((maxLevel - i) * 2);
            System.out.print(espacios);
            for (Node n : nivel) {
                  System.out.print(n.getValue() + "   ");
            }
            System.out.println();
        }
    }   
}
