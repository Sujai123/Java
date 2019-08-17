public class Knight123 {
    public static void main(String[] args) {
      int[][] a = new int[4][4];
      a[0][0]=1;
      boolean b=solve(a,0,0);
      System.out.println(b);
    }
    public static boolean solve(int[][] a,int n1,int n2){
      if(isSafe(a,n1+1,n2+2)){
        if(solve(a,n1+1,n2+2)){
          a[n1+1][n2+2]=1;
        return true;
        }
      }
      if(isSafe(a,n1-1,n2+2)){
        if(solve(a,n1-1,n2+2)){
          a[n1-1][n2+2]=1;
        return true;
        }
      }
      if(isSafe(a,n1+1,n2-2)){
        if(solve(a,n1+1,n2-2)){
          a[n1+1][n2-2]=1;
        return true;
        }
      }
      if(isSafe(a,n1-1,n2-2)){
        if(solve(a,n1-1,n2-2)){
          a[n1-1][n2-2]=1;
        return true;
        }
      }
      if(isSafe(a,n2+1,n1+2)){
        if(solve(a,n2+1,n1+2)){
          a[n2+1][n1+2]=1;
        return true;
        }
      }
      if(isSafe(a,n2-1,n1+2)){
        if(solve(a,n2-1,n1+2)){
          a[n2-1][n1+2]=1;
        return true;
        }
      }
      if(isSafe(a,n2+1,n1-2)){
        if(solve(a,n2+1,n1-2)){
          a[n2+1][n1-2]=1;
        return true;
        }
      }
      if(isSafe(a,n2-1,n1-2)){
        if(solve(a,n2-1,n1-2)){
          a[n2-1][n1-2]=1;
        return true;
        }
      }
      return false;
    }
    public static boolean isSafe(int[][] a,int n1,int n2){
      int temp=999;
      for(int i=0;i<a.length;i++){
        for(int j=0;j<a[i].length;j++){
          if(a[i][j]==0)
            temp=0;
        }
      }
      if(temp==0){
     if(n1>=0&&n1<=3&&n2>=0&&n2<=3&&a[n1][n2]==0)
     return true;
     return false;
   }else{
    return false;
   }
    }
}