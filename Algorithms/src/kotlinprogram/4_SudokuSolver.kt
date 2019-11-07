package kotlinprogram

fun main(arg: Array<String>) {

    var first = charArrayOf('8', '.', '.', '.', '.', '.', '.', '.', '.')
    var second = charArrayOf('.', '.', '3', '6', '.', '.', '.', '.', '.')
    var third = charArrayOf('.', '7', '.', '.', '9', '.', '2', '.', '.')
    var fourth = charArrayOf('.', '5', '.', '.', '.', '7', '.', '.', '.')
    var fifth = charArrayOf('.', '.', '.', '.', '4', '5', '7', '.', '.')
    var sixth = charArrayOf('.', '.', '.', '1', '.', '.', '.', '3', '.')
    var seventh = charArrayOf('.', '.', '1', '.', '.', '.', '.', '6', '8')
    var eighth = charArrayOf('.', '.', '8', '5', '.', '.', '.', '1', '.')
    var nineth = charArrayOf('.', '9', '.', '.', '.', '.', '4', '.', '.')

    var board = arrayOf(first, second, third, fourth, fifth, sixth, seventh, eighth, nineth)

    solveSudoku(board)
    print(board.joinToString(""));
}

fun solveSudoku(board: Array<CharArray>): Unit {
    dfs(0, board)
}

fun dfs(pos: Int, board: Array<CharArray>): Boolean {
    if (pos == 81) {//already finish the sudoku
        return true
    }
    val curRow = pos / 9
    val curCol = pos % 9
    if (board[curRow][curCol] == '.') {
        for (c in '1'..'9') {
            board[curRow][curCol] = c
            if (isValid(board, curRow, curCol) && dfs(pos + 1, board)) {
                return true
            }
            //go to this line, it means previous try is does not work, so need to return to initial '.'
            board[curRow][curCol] = '.'
        }
    } else {
        return dfs(pos + 1, board)
    }
    return false
}

fun isValid(board: Array<CharArray>, curRow: Int, curCol: Int): Boolean {
    val c = board[curRow][curCol]
    val xx = curRow / 3 * 3
    val yy = curCol / 3 * 3  // (xx, yy) start position of this block
    for (i in 0..8) {
        if (i != curRow && board[i][curCol] == c) return false //check if c exist in this column
        if (i != curCol && board[curRow][i] == c) return false //check if c exist in this row
        val tx = i / 3
        val ty = i % 3
        if (xx + tx != curRow && yy + ty != curCol && board[xx + tx][yy + ty] == c) {//check in the block, check (xx + tx != curRow && yy + ty != curCol) this is the current position
            return false
        }
    }
    return true
}