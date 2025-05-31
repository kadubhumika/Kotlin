fun main() {

    val accounts = mutableListOf<BankAccount>()


    while (true) {
        println("\n--- Create New Bank Account ---")
        print("Enter Account Holder Name: ")
        val name = readln()
        print("Enter Initial Balance: ")
        val initialBalance = readln().toDouble()
        print("Enter User name : ")
        val userd = readln().toString()

        val user = BankAccount(name, initialBalance, userd)
        accounts.add(user)
        println("Welcome, ${user.accountHolder}")
        user.details()

        print("Want to deposit amount? (y/n): ")
        val ans = readln()
        if (ans.lowercase() == "y") {
            print("Enter deposit amount: ")
            val amount = readln().toDouble()
            user.deposit(amount)
        }

        print("Want to withdraw amount? (y/n): ")
        val ans1 = readln()
        if (ans1.lowercase() == "y") {
            print("Enter withdraw amount: ")
            val amount = readln().toDouble()
            user.withdraw(amount)
        }

        print("Want to see all transaction details? (y/n): ")
        val ans2 = readln()
        if (ans2.lowercase() == "y") {
            print("Enter user name: ")
            val check = readln()
            if (check == user.username) {
                user.displayTransaction()
            } else {
                println("Invalid user name. Access denied.")
            }
        }
    }
}
