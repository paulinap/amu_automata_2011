package pl.edu.amu.wmi.daut.base;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 */
public class AutomatonUtilities {
    
    static Set<Character> getAlphabet(AutomatonSpecification automaton, Set<Character> superset) {
        
        Set<Character> alphabet = new HashSet<Character>();
        
        for (State s : automaton.allStates()) {
            for (OutgoingTransition ot : automaton.allOutgoingTransitions(s)) {
                for (Character c : superset) {
                    /* sprawdzic czy dany znak jestr akceptowany  i jesli jest to reszty nie sprawdzac 
                     * jest - sprawdzic czy juz nie ma w alphabet i alphabet.add(c) i break? continue?
                     * nie ma - nastepny znak
                     */
                }
            }
        }
        
        return alphabet;
                
    }
    
}
