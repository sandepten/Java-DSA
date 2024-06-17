//? You are given n activities with their start and end times. Select the maximum number of activities that can be performed by a single person, assuming that a person can only work on a single activity at a time. (Activities are sorted according to end time)

/*
start = [10, 12, 20]
end = [20, 25, 30]
*/

// There are other problems which use the same logic like: Disjoint set, Max meetings in a room

package main

import "fmt"

func activitySelection() {
	startArr := []int{1, 3, 0, 5, 8, 5}
	endArr := []int{2, 4, 6, 7, 9, 9}
	// startArr := []int{10, 12, 20}
	// endArr := []int{20, 25, 30}

	total_activities := 1

	last_end_time := endArr[0]
	for i := 1; i < len(startArr); i++ {
		if startArr[i] >= last_end_time {
			total_activities++
			last_end_time = endArr[i]
		}
	}

	fmt.Println(total_activities)
}
