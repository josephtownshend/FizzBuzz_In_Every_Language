package main

import "fmt"

func FizzBuzz(n int) string {
	fizz := (n%3 == 0)

		if fizz {
		return "Fizz"
	} else {
		return fmt.Sprintf("%d", n)
	}
}