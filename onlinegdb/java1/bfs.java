import java.util.*;
public class YourClassNameHere {
    public static void main(String[] args) {
      Graph g=new Graph(4);
      g.add(0, 1); 
        g.add(0, 2); 
        g.add(1, 2); 
        g.add(2, 0); 
        g.add(2, 3); 
        g.add(3, 3);
        g.print();
        g.bfs(2);
    }
}
class Graph{
  int v;
  LinkedList<Integer> adj[];
 Graph(int v){
  this.v=v;
  adj=new LinkedList[v];
  for(int i=0;i<v;i++){
    adj[i]=new LinkedList();
  }
 }
 void add(int i,int j){
   adj[i].add(j);
 }
 void print(){
   for(int i=0;i<adj.length;i++)
  System.out.println(adj[i]); 
 }
 
 void bfs(int s){
  LinkedList<Integer> q=new LinkedList();
  boolean visited[]=new boolean[v];  
  visited[s]=true;
  q.add(s);
  while(!q.isEmpty()){
   int n=q.poll();
   System.out.println(n);
   Iterator<Integer> itr=adj[n].iterator();
   while(itr.hasNext()){
     int k=itr.next();
     if(!visited[k]){
     visited[k]=true;
     q.add(k);
     }
   }
  }
   
 }
}
