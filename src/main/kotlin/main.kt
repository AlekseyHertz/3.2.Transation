fun main() {
    val userTransfer = totalTransfer(transfer = 75_000, userCard = "Maestro")
    println("Сумма комиссии: $userTransfer")
}

fun totalTransfer(transfer: Int, userCard: String) = when (userCard) {
    "MasterCard", "Maestro" -> {
        if (transfer < 75_000) {
            0
        } else {
            ((transfer * 0.006) + 20).toInt()
        }
    }

    "Visa", "Mir" -> {
        if (transfer * 0.075 < 35) {
            35
        } else {
            (transfer * 0.075).toInt()
        }
    }

    else -> 0
}
