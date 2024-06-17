//? Given the weights and values of N items, put these items in a knapsack of capacity W to get the maximum total value in the knapsack.

// There is another question called 0-1 knapsack which is solved by dynamic programming
package main

import "fmt"

func fractionalKnapsack() {
	values := []int{60, 100, 120}
	weights := []int{10, 20, 30}
	capacity := 50

	currCapacity := 0
	currValue := 0

	// 2d array to store the ratios and the values and weights
	fullArray := [][]int{}
	for index, value := range values {
		fullArray = append(fullArray, []int{value, weights[index], value / weights[index]})
	}

	// sort the array based on the ratios
	for i := 0; i < len(fullArray); i++ {
		for j := i + 1; j < len(fullArray); j++ {
			if fullArray[i][2] < fullArray[j][2] {
				temp := fullArray[i]
				fullArray[i] = fullArray[j]
				fullArray[j] = temp
			}
		}
	}

	for _, value := range fullArray {
		weight := value[1]
		if weight > (capacity - currCapacity) {
			unitPrice := value[0] / weight
			currValue += (capacity - currCapacity) * unitPrice
			break
		}
		currCapacity += weight
		currValue += value[0]
	}

	fmt.Println(currValue)
}
