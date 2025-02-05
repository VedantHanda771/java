import java.util.*;

public class A_Doremy_s_Paint_3 {
			public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				int t=sc.nextInt();
				while(t-->0){
					int n=sc.nextInt();
					int a[]=new int[n+1];
					HashMap<Integer,Integer>map=new HashMap<>();
					for(int i=1;i<=n;i++){
						a[i]=sc.nextInt();
						map.put(a[i],map.getOrDefault(a[i],0)+1);
					}
					ArrayList<Integer>list=new ArrayList<>(map.values());
					Collections.sort(list);
					if((list.size()==2 && (list.get(1)-list.get(0)<=1)) || list.size()==1  ){
						System.out.println("YES");
					}
					else
					System.out.println("NO");
				}
			}
}