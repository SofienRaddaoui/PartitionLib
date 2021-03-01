package com.positivethinking.partition.unit;

import com.positivethinking.partition.IPartition;
import com.positivethinking.partition.PartitionImpl;
import org.hamcrest.core.IsEqual;
import org.junit.Test;


import java.util.Arrays;
import java.util.Collections;

import static org.hamcrest.MatcherAssert.assertThat;

public class PartitionTest {

    private final IPartition iPartition;

    public PartitionTest() {
        this.iPartition = new PartitionImpl();
    }

    @Test
    public void shouldReturnNullForEmptyList() {
        assertThat(iPartition.partition(null, 1), IsEqual.equalTo(null));
    }

    @Test
    public void shouldReturnNullForTailleLessThanOrEqualsToZero() {
        assertThat(iPartition.partition(Collections.singletonList(1), 0), IsEqual.equalTo(null));
        assertThat(iPartition.partition(Arrays.asList(1, 2), -1), IsEqual.equalTo(null));
    }

    @Test
    public void souldReturnSameListeForTailleMoreThanOrEqualsToListSize() {

        assertThat(iPartition.partition(Collections.singletonList(1), 1), IsEqual.equalTo(Collections.singletonList(Arrays.asList(1))));
        assertThat(iPartition.partition(Arrays.asList(1, 2), 2), IsEqual.equalTo(Collections.singletonList(Arrays.asList(1, 2))));
        assertThat(iPartition.partition(Arrays.asList(1, 2, 3, 4, 5), 5), IsEqual.equalTo(Collections.singletonList(Arrays.asList(1, 2, 3, 4, 5))));
        assertThat(iPartition.partition(Arrays.asList(1, 2, 3, 4), 5), IsEqual.equalTo(Collections.singletonList(Arrays.asList(1, 2, 3, 4))));
        assertThat(iPartition.partition(Arrays.asList(1, 2), 3), IsEqual.equalTo(Collections.singletonList(Arrays.asList(1, 2))));

    }

    @Test
    public void souldReturnListOfSubListsWithMaximumSizeEqualsToTaille() {
        //partition([1,2,3,4,5], 2) retourne: [ [1,2], [3,4], [5] ]
        assertThat(iPartition.partition(Arrays.asList(1,2,3,4,5), 2),
                IsEqual.equalTo(Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4), Arrays.asList(5))));

        //partition([1,2,3,4,5], 3) retourne: [ [1,2,3], [4,5] ]
        assertThat(iPartition.partition(Arrays.asList(1,2,3,4,5), 3),
                IsEqual.equalTo(Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(4, 5))));

        //partition([1,2,3,4,5], 1) retourne: [ [1], [2], [3], [4], [5] ]
        assertThat(iPartition.partition(Arrays.asList(1,2,3,4,5), 1),
                IsEqual.equalTo(Arrays.asList(Arrays.asList(1), Arrays.asList(2), Arrays.asList(3), Arrays.asList(4), Arrays.asList(5))));

    }
}
