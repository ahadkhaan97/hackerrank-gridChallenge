fun main() {
    print(gridChallenge(arrayOf("kc", "iu")))
}

fun gridChallenge(grid: Array<String>): String {
    for (i in grid.indices) {
        grid[i] = grid[i].toCharArray().sorted().joinToString("")
    }
    for (i in 0 until grid[0].length) {
        for (j in 0 until grid.size - 1) {
            if (grid[j][i].code > grid[j + 1][i].code) {
                return "NO"
            }
        }
    }
    return "YES"
}