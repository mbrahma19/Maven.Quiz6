package rocks.zipcode.io.collections;

import java.util.*;

/**
 * @author leon on 10/01/2019.
 */
public class PowerSet<TypeOfSet> {
    protected final Set<TypeOfSet> originalSet;

    public PowerSet(TypeOfSet[] originalSet) {
        this.originalSet = new HashSet<>(Arrays.asList(originalSet));
    }

    /**
     * @return the powerset of `originalSet`
     */
    public Set<Set<TypeOfSet>> permute() {
        Set<Set<TypeOfSet>> megaSet = new HashSet<>();
        List<TypeOfSet> list = new ArrayList<>(originalSet);

        for(int i = 0 ; i < list.size(); i++){
            for(int j = i; j < list.size(); j++){
                megaSet.add(new HashSet<>(list.subList(i,j+1)));
            }
        }
        return megaSet;
    }

    /**
     * @return `originalSet`
     */
    public Set<TypeOfSet> getOriginalSet() {
        return originalSet;
    }
}
