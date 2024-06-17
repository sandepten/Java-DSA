//? You are given n pairs of numbers. In every pair, the first number is always smaller then the second number. A pair (c, d) can come after pair (a, b) if b < c. Find the longest chain which can be formed from a given set of pairs
// This question is similar to activity selection

package main

import (
	"fmt"
	"sort"
)

func maxChainOfPairs() {
	pairs := [][]int{{5, 24}, {39, 60}, {5, 28}, {27, 40}, {50, 90}}

	// sorting the pairs according to their 2nd value
	sort.Slice(pairs, func(i, j int) bool {
		return pairs[i][1] < pairs[j][1]
	})

	// finding the pairs
	prev_end := pairs[0][1]
	total_pairs := 1

	for index, pair := range pairs {
		if index == 0 {
			continue
		}
		if pair[0] > prev_end {
			total_pairs++
			prev_end = pair[1]
		}
	}
	fmt.Println(total_pairs)
}
