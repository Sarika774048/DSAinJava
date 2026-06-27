package com.graphs.dsa;

import java.util.ArrayList;
import java.util.Scanner;

public class Input {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        System.out.println("Store graph using adjacency matrix: ");
//        System.out.println("Number of edges: ");
//        int n = scanner.nextInt();
//        int[][] adjMatrix = new int[n+1][n+1];
//
//        for(int i=0; i<adjMatrix.length; i++){
//            int u = scanner.nextInt();
//            int v = scanner.nextInt();
//            // undirected graph
//            adjMatrix[u][v] = 1;
//            adjMatrix[v][u] = 1;
//        }

        System.out.println("Store elements using adjacency list: ");
        // number of edges
        int m = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
        for(int i=0; i<=m; i++){
            adj.add(new ArrayList<>());
        }
        // store elements
        adj.get(1).add(2);
        adj.get(1).add(3);
        adj.get(2).add(1);
        adj.get(2).add(4);
        adj.get(3).add(4);
        adj.get(3).add(1);
        adj.get(4).add(2);
        adj.get(4).add(3);
        adj.get(4).add(5);
        adj.get(5).add(2);
        adj.get(5).add(4);

        // print all elements
        for(int i=0; i<=m; i++){
            for(int j=0; j<adj.get(i).size(); j++){
                System.out.println(i+ " : " + adj.get(i).get(j)+" ");
            }
        }






    }
}
