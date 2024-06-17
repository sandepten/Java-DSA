//? We are given an infinite supply of denomination [1, 2, 5, 10, 20, 50, 100, 500, 2000]. Find the min number of coins/notes to make change for a value V
// Greedy system only works on canonical coin systems

package main

import (
	"fmt"
	"sort"
)

func indianCoins() {
	// coins := []int{1, 2, 5, 10, 20, 50, 100, 500, 2000}
	coins := []int{1, 2, 5, 10, 20, 50, 100, 200, 500}
	sort.Sort(sort.Reverse(sort.IntSlice(coins)))

	var num int
	_, err := fmt.Scanf("%d", &num)
	if err != nil {
		fmt.Println("Error:", err)
		return
	}

	total_coins := 0
	coins_used := []int{}

	for _, coin := range coins {

		if coin <= num {
			for coin <= num {
				total_coins++
				coins_used = append(coins_used, coin)
				num -= coin
			}
		}
	}
	fmt.Println(total_coins)
	fmt.Println(coins_used)
}
