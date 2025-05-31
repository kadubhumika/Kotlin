class BankAccount(var accountHolder: String, var balance: Double, var username : String) {
    private val transactionDetails = mutableListOf<String>()

    fun details() {
        print("Enter username: ")
        val user = readln()
        print("Enter Pin Code Of Your Account: ")
        val pinCode = readln().toInt()
        println("$user, your pin code is $pinCode")
    }

    fun deposit(amount: Double) {
        balance += amount
        transactionDetails.add("$accountHolder deposits ₹$amount")
        transactionDetails.add("Total balance updated to ₹$balance")
    }

    fun withdraw(amount: Double) {
        if (amount > balance) {
            println("Insufficient bank balance. Please check your balance!")
        } else {
            balance -= amount
            transactionDetails.add("$accountHolder withdraws ₹$amount")
            transactionDetails.add("Total balance updated to ₹$balance")
        }
    }

    fun displayTransaction() {
        println("Transaction history for $accountHolder:")
        for (i in transactionDetails) {
            println(i)
        }
    }
}
