package com.graphs.dsa;

import java.util.ArrayList;
import java.util.Scanner;

public class DFS {
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

        // read the output
        for(int i=0; i<e; i++){
            int src = scanner.nextInt();
            int dest = scanner.nextInt();
            adj.get(src).add(dest);
            adj.get(dest).add(src);
        }

        // depth first search
        System.out.println("Depth first search: ");
        ArrayList<Integer> result = dfsOfGraph(v, adj);
        for(Integer ele : result){
            System.out.print(ele + " ");
        }

    }

    static ArrayList<Integer> dfsOfGraph(int v, ArrayList<ArrayList<Integer>> adj) {
        boolean vis[] = new boolean[v+1];
        vis[1] = true;
        ArrayList<Integer> ls = new ArrayList<>();
        dfs(1, vis, adj, ls);
        return ls;
    }

    private static void dfs(Integer ele, boolean[] vis, ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> result) {
        vis[ele] = true;
        result.add(ele);
        for(Integer el : adj.get(ele)){
            if(!vis[el]){
                dfs(el, vis, adj, result);
            }
        }
    }
}
