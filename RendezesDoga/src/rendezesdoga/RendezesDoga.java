package rendezesdoga;
public class RendezesDoga {

    public static void main(String[] args) {
        int[] tomb = {1,0,2,4,3,5,6,7,8,9};
        int start = tomb[0];
        for (int i = 0; i < tomb.length; i++) {
            if (start > tomb[i] ) {
                int rossz = tomb[i];
                tomb[i] = start;
                
            }
        for (int j = 0; j < tomb.length; j++) {
            System.out.println(tomb[j]);
        }
        }
           
    }
    
}
