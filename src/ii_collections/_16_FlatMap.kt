package ii_collections

fun example() {

    val result = listOf("abc", "12").flatMap { it.toList() }

    result == listOf('a', 'b', 'c', '1', '2')
}

val Customer.orderedProducts: Set<Product> get() {
    return orders.flatMap { it.products } .toCollection(HashSet<Product>())
}

val Shop.allOrderedProducts: Set<Product> get() {
    return customers.flatMap { it.orders }.flatMap { it.products }.toCollection(HashSet<Product>())
}
