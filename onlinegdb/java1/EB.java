import java.util.*;
class EB{
    String shop;
    int unit;
    EB(String shop,int unit){
        this.shop=shop;
        this.unit=unit;
    }
}
public class Main
{
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
	    String[] str={"Jan 1, 2020: shop1 320$shop2 220$shop3 330$shop4 420$shop5 5",
                    "Jan 2, 2020: shop5 318$shop4 320$shop3 330$shop2 420$shop1 5",
                    "Jan 3, 2020: shop1 316$shop1 820$shop3 330$shop4 420$shop5 5",
                    "Jan 4, 2020: shop1 314$shop2 110$shop3 68$shop4 420$shop5 5",
                    "Jan 5, 2020: shop1 323$shop2 220$shop3 330$shop4 420$shop5 5",
                    "Jan 6, 2020: shop1 324$shop3 330$shop4 420$shop5 5",
                    "Jan 7, 2020: shop1 320$shop2 220$shop3 330$shop4 420$shop5 51",
                    "Jan 8, 2020: "
                    };
        int n=str.length;
        System.out.println(n);
        for(int i=0;i<n;i++){
            String temp=str[i];
            int k=temp.indexOf(":");
            str[i]=temp.substring(k+2);
        }
        HashMap<String,Integer> map=new HashMap();
        for(int i=0;i<n;i++){
            String[] day=str[i].split("\\$");
            for(int j=0;j<day.length;j++){
                String[] s=day[j].split(" ");
                if(s.length>1){
                    if(!map.containsKey(s[0])){
                map.put(s[0],Integer.parseInt(s[1]));
                    }else{
                        int cost=map.get(s[0]);
                        map.put(s[0],Integer.parseInt(s[1])+cost);
                    }
                }
            }
        }
        System.out.println(map);
        
        
        // for(int i=0;i<n;i++){
        //     System.out.println(str[i]);
        // }
	}
}

