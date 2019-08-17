/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sample;

/**
 *
 * @author HP
 */
public class Partition {
    public static void main(String[] args){
        int n=5;
        int k=0;
        int p[]=new int[n];
        p[k]=n;
        while(true){
            int r=0;
            for(int i=0;i<=k;i++){
            //    if(p[0]>=p[k])
                System.out.print(p[i]+" ");
            }
            System.out.println();
            while(k>=0&&p[k]==1){
                r+=p[k];
                k--;
            }
            if(k<0)
                break;
            p[k]--;
            r++;
            //System.out.println(p[k]);
            while(r>p[k]){
                p[k+1]=p[k];
                r-=p[k];
                k++;
            }
            p[k+1]=r;
            k++;
        
    }
}
}
