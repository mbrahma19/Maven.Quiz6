package rocks.zipcode.io.collections;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import com.google.common.collect.Sets;

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
//        Set<Set<TypeOfSet>> megaSet = new HashSet<>();
//        List<TypeOfSet> list = new ArrayList<>(originalSet);
//
//        for(int i = 0 ; i < list.size(); i++){
//            for(int j = i; j < list.size(); j++){
//                megaSet.add(new HashSet<>(list.subList(i,j+1)));
//
//                if(j+1 < list.size()){
//                    megaSet.add(new HashSet<>(Arrays.asList(list.get(i),list.get(j+1))));
//                }
//
//                if(j > i && j+1 < list.size()){
//                    List<TypeOfSet> firstList = list.subList(i,j-1);
//                    firstList.addAll(list.subList(j+1,list.size()-1));
//                    megaSet.add(new HashSet<>(firstList));
//                }
//            }
//        }
//        //megaSet.forEach(item -> System.out.println(item));
//        return megaSet;

        return Sets.powerSet(originalSet);
    }
    /**
     * @return `originalSet`
     */
    public Set<TypeOfSet> getOriginalSet() {
        return originalSet;
    }
}
