import java.util.*;
public class YourClassNameHere {
    public static void main(String[] args) {
      Graph g=new Graph(4);
       g.addEdge(0, 1); 
        g.addEdge(0, 2); 
        g.addEdge(1, 2); 
        g.addEdge(2, 0); 
        g.addEdge(2, 3); 
        g.addEdge(3, 3); 
      g.print();
      g.dfs(2);
    }
}
class Graph{
 private int v;
 LinkedList<Integer>adj[];
 Graph(int v){
  this.v=v; 
  adj=new LinkedList[v];
  for(int i=0;i<v;i++){
   adj[i]=new LinkedList(); 
  }
 }
 void addEdge(int i,int f){
  adj[i].add(f); 
 }
 void print(){
   for(int i=0;i<v;i++){
    System.out.println(adj[i]); 
   }
 }
 boolean[] visited=new boolean[4];
 void dfs(int r){
   visited[r]=true;
   System.out.println(r);
   Iterator itr=adj[r].iterator();
   while(itr.hasNext()){
     int k=(int)(itr.next());
     if(!visited[k])
     dfs(k);
   }
 }
}
