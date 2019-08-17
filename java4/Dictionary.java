public class Dictionary{
	public static void main(String[] args){
		char[][] ch={
			{'A','B','C','I'},
			{'S','I','C','S'},
			{'E','D','E','E'}
		};
		String str="SEE";
		boolean flg=false;
		for(int i=0;i<ch.length;i++){
			for(int j=0;j<ch[0].length;j++){
				if(ch[i][j]==str.charAt(0)){
					if(isDict(ch,str,i,j,0))
						flg=true;
				}
			}
			if(flg)
				break;
		}
		System.out.println(flg);
	}
	public static boolean isDict(char[][] ch,String str,int x,int y,int t){
		if(str.length()==t)
			return true;
		if(!(isValid(ch,x,y)))
			return false;
		if(str.charAt(t)!=ch[x][y])
			return false;
		if(isDict(ch,str,x+1,y,t+1))
			return true;
		if(isDict(ch,str,x,y+1,t+1))
			return true;
		if(isDict(ch,str,x-1,y,t+1))
			return true;
		if(isDict(ch,str,x,y-1,t+1))
			return true;
		return false;
	}
	public static boolean isValid(char[][] ch,int x,int y){
		int x1=ch.length;
		int y1=ch[0].length;
		if(x>=0&&x<x1&&y>=0&&y<y1)
			return true;
		else
			return false;
	}
}