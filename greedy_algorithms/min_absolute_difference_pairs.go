//? Given two arrays A and B of equal length n. Pair each element of array A to an element in array B, such that sum S of absolute differences of all the pairs is minimum

// absolute value is always positive, so if a-b=1 and b-a=-1, then their absolute differnce is 1
package main

import (
	"fmt"
	"math"
	"sort"
)

func absoluteDifference() {
	A := []int{4, 1, 8, 7}
	B := []int{2, 3, 6, 5}
	// A := []int{1, 2, 3}
	// B := []int{2, 1, 3}

	// sorting the arrays so that we pair the smallest element with the smallest element in other array
	sort.Ints(A)
	sort.Ints(B)

	total_absolute_difference := 0.0
	for index, val := range A {
		total_absolute_difference += math.Abs(float64(val - B[index]))
	}

	fmt.Println(total_absolute_difference)
}
