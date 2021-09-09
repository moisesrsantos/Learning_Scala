def isEven(x: Int): Boolean = x%2 == 0

def isOdd(x: Int): Boolean = !isEven((x))

isEven(2)
isOdd(2)



val list = List(1,2,3,4,5,6,7,8)

val listEven = list.filter(x => isEven(x))


val listOdd = list.filterNot(x => isEven(x))

val list_twice = list.map(x => x*2)

