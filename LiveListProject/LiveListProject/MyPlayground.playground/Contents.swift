import UIKit

var greeting = "Hello, playground"

func arith(a: Int, b: Int, op: (Int,Int) -> Int)->Int {
    return op(a,b)
}
func add(x: Int, y: Int)-> Int {
    return x+y
}

arith(a: 5, b: 6, op: {
    (x, y) in return x+y
})
