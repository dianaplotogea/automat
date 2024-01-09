

import java.util.Map;
import java.util.Set;

public class AutomatVerifier {
	
	public static boolean isDeterministic(
    Set<String> Q, Set<Character> Sigma, Map<String, Map<Character, Set<String>>> delta, String q0, Set<String> F
) {
    for (String q : Q) {
        if (!delta.containsKey(q)) {
            continue; // No transitions for this state, move to the next state
        }

        for (char a : Sigma) {
            if (delta.get(q).containsKey(a) && delta.get(q).get(a).size() > 1) {
                return false; // Multiple transitions for a symbol
            }
        }
    }
    return true;
}


	
	

}
