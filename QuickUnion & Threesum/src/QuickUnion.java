/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class QuickUnion {
    private int[] id;

    public QuickUnion(int N) {
        id = new int [N];
        for(int i = 0; i < N; i++){
            id[i] = i;
        }
    }

    private int root(int i){
        while (i != id[i]){
            i = id[i];
        }
        return i;
    }

    public boolean connected(int p, int q){
        return root(p) == root(q);
    }

    public void union(int p, int q){
        int i = root(p);
        int j = root(q);
        id[i] = j;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        QuickUnion q = new QuickUnion(10);

        for(int i=0;i<10;i++)
            System.out.print(q.id[i]+"");
        System.out.print("\n");
        q.union(4,3);
        for(int i=0;i<10;i++)
            System.out.print(q.id[i]+"");
        System.out.print("\n");
        q.union(3,8);
        for(int i=0;i<10;i++)
            System.out.print(q.id[i]+"");
        System.out.print("\n");
        q.union(6,5);
        for(int i=0;i<10;i++)
            System.out.print(q.id[i]+"");
        System.out.print("\n");
        q.union(9,4);
        for(int i=0;i<10;i++)
            System.out.print(q.id[i]+"");
        System.out.print("\n");
        q.union(2,1);
        for(int i=0;i<10;i++)
            System.out.print(q.id[i]+"");
        System.out.print("\n");
        q.union(5,0);
        for(int i=0;i<10;i++)
            System.out.print(q.id[i]+"");
        System.out.print("\n");
        q.union(7,2);
        for(int i=0;i<10;i++)
            System.out.print(q.id[i]+"");
        System.out.print("\n");
        q.union(6,1);
        for(int i=0;i<10;i++)
            System.out.print(q.id[i]+"");
        System.out.print("\n");
        q.union(7,3);
        for(int i=0;i<10;i++)
            System.out.print(q.id[i]+"");
    }

}