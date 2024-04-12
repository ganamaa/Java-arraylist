//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        ArrayList<ArrayList<Integer>> d = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int nline = scanner.nextInt();
            ArrayList<Integer> line = new ArrayList<>();
            for (int j = 0; j < nline; j++) {
                line.add(scanner.nextInt());
            }
            d.add(line);
        }
        int nq = scanner.nextInt();
        scanner.nextLine();
        ArrayList<ArrayList<Integer>> q = new ArrayList<>();
        for (int i = 0; i < nq; i++) {
            ArrayList<Integer> line = new ArrayList<>();
            line.add(scanner.nextInt());
            line.add(scanner.nextInt());
            q.add(line);
        }
        for (ArrayList<Integer> queries: q){
            int x,y;
            y = queries.get(0)-1;
            x = queries.get(1)-1;
            if(y > d.size()-1){
                System.out.println("ERROR!");
                continue;
            }
            if (x > d.get(y).size()-1){
                System.out.println("ERROR!");
                continue;
            }
            System.out.println(d.get(y).get(x));
        }
        scanner.close();
    }
}