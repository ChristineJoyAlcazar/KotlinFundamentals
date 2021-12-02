
fun main() {
    val nickName="tine"
    val product=100
    val amount=10
    println("Order/s for: $nickName")
    println("The amount to pay ${product*amount}")
    println(nickName.replaceFirstChar { nickName.first().uppercase() })


}