package kotlinprogram

fun main(arg: Array<String>) {
    val board = arrayOf(
        charArrayOf('X', 'X', 'X', 'X'),
        charArrayOf('X', 'O', 'O', 'X'),
        charArrayOf('X', 'X', 'O', 'X'),
        charArrayOf('X', 'O', 'X', 'X')
    )
    solve(board)
    print(board.joinToString(" "))
}

fun solve(board: Array<CharArray>): Unit {
    for (i in 0 until board.size) {
        for (j in 0 until board[0].size) {
            if ((i == 0 || i == board.size - 1 || j == 0 || j == board[0].size - 1) && board[i][j] == 'O') {
                dfs(i, j, board)
            }
        }
    }

    for (i in 0 until board.size) {
        for (j in 0 until board[0].size) {
            when (board[i][j]) {
                '$' -> board[i][j] = 'O'
                'O' -> board[i][j] = 'X'
            }
        }
    }
}

private fun dfs(i: Int, j: Int, board: Array<CharArray>) {
    if (board[i][j] == 'O') {
        board[i][j] = '$'
        if (i > 0 && board[i - 1][j] == 'O') {
            dfs(i - 1, j, board)
        }

        if (i < board.size - 1 && board[i + 1][j] == 'O') {
            dfs(i + 1, j, board)
        }
        if (j > 0 && board[i][j-1] == 'O') {
            dfs(i, j - 1, board)
        }
        if (j < board[0].size - 1 && board[i][j + 1] == 'O') {
            dfs(i, j + 1, board)
        }
    }
}