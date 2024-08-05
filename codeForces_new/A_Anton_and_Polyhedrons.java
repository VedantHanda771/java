import java.util.*;

public class A_Anton_and_Polyhedrons {

    void solve(){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        sc.nextLine();

        int count =0;
        for (int i= 0;i<n;i++){
            String s= sc.nextLine();
            if(s.matches("Tetrahedron"))
            count +=4;
            if(s.matches("Cube"))
            count +=6;
            if(s.matches("Octahedron"))
            count +=8;
            if(s.matches("Dodecahedron"))
            count+=12;
            if(s.matches("Icosahedron"))
            count+=20;
        }
        System.out.println(count);
        sc.close();
    }

    public static void main(String[] args) {
        
        new A_Anton_and_Polyhedrons().solve();
    }

    
}