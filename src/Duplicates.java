import java.util.ArrayList;

public class Duplicates {
    static void main() {
        String[] infra = {"Amazon", "GCP", "Amazon", "Azure", "GCP"};

        for (int i = 0; i < infra.length; i++){
            for (int j = i + 1; j < infra.length; j++){
                if (infra[i].equals(infra[j])){
                    System.out.println("Duplicates are: "+infra[i]);
                }
            }
        }

    }
}
