fun main() {
    val customer1 = Shopping("Jeans", "OffShoulder", "PencilHill", 23450)
    val customer2 = Shopping("Shirt", "NeckCut", "VadapavSandal", 23450)

    println("Details of Customer 1:")
    customer1.displayDetails()

    println("\nDetails of Customer 2:")
    customer2.displayDetails()
}

class Shopping(
    val dressType: String,
    val topsType: String,
    val slipper: String,
    val totalCost: Int
) {

    fun displayDetails() {
        println("Dress: $dressType")
        println("Top: $topsType")
        println("Slippers: $slipper")
        println("Total Cost: ₹$totalCost")
    }

    // Optional: Static-like price list
    
}
