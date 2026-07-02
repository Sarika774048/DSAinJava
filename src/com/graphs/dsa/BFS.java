package com.graphs.dsa;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // number of vertices
        int v = scanner.nextInt();
        // number of edges
        int e = scanner.nextInt();

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0; i<=v; i++){
            adj.add(new ArrayList<>());
        }

        // read edges
        for(int i=0; i<e; i++){
            int u = scanner.nextInt();
            int c = scanner.nextInt();
            adj.get(u).add(c);
            adj.get(c).add(u);
        }

        // print the adjacency list
        for(int i=0; i<v; i++){
            System.out.println(i + " -> " + adj.get(i));
        }

        // Breadth first search
        System.out.println("Breadth first search: ");
        ArrayList<Integer> result = bfs(adj, 1, v);
        for(Integer ele : result){
            System.out.print(ele +" ");
        }

    }

     static ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj, int i, int V) {
        ArrayList<Integer> result = new ArrayList<>();
          // queue
         LinkedList<Integer> q = new LinkedList<>();
         // visited array
         boolean[] vis = new boolean[V+1];
         q.offer(i);
         vis[i] = true;
         while(!q.isEmpty()){
            // take the element and put it inside the queue
             Integer node = q.poll();
             result.add(node);

             for(Integer ele : adj.get(node)){
                 if(!vis[ele]){
                     vis[ele] = true;
                     q.offer(ele);
                 }
             }
         }

        return result;
    }
}
