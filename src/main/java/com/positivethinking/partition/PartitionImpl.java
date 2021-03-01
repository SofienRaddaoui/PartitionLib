package com.positivethinking.partition;



import java.util.ArrayList;
import java.util.List;

public class PartitionImpl implements IPartition {


    /**
     * partition method to divide the original list into sublist of the given size,
     *
     * Sublist are just views of the original list.
     * The final sublist may be smaller.
     *
     * @param liste original list to be devided
     * @param taille maximum size of sublist
     * @return list of sublists extracted from the original list
     */
    @Override
    public List<List<Integer>> partition(List<Integer> liste, int taille) {

        // not specified
        if (liste == null || liste.size() == 0 || taille <= 0) {
            return null;
        }

        // we can use lib Guva/Apache/ Collectors groupingBy .... -> One implementation per methode
        List<List<Integer>> partitions = new ArrayList<List<Integer>>();
        int length = liste.size();
        int numOfPartitions = length / taille + ((length % taille == 0) ? 0 : 1);
        for (int i = 0; i < numOfPartitions; i++) {
            int from = i * taille;
            int to = Math.min((i * taille + taille), length);
            partitions.add(liste.subList(from, to));
        }

        return partitions;
    }
}
