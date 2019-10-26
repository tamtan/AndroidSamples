package kotlinprogram

fun main(arg: Array<String>) {
    print(solveNQueens(4).joinToString(""))

}
fun solveNQueens(n: Int): List<List<String>> {
    var result = mutableListOf<MutableList<String>>()
    var board = mutableListOf<String>()
    var row = ""
    for (i in 0 until n) row = "$row." //create n . just 1 row
    for (i in 0 until n) { //list of rows
        board.add(row)
    }
    backTracking(n, 0, result, board)
    return result
}

private fun backTracking(size: Int, curRow: Int, result: MutableList<MutableList<String>>, board: MutableList<String>) {
    if (curRow == size) {
        result.add(board.toMutableList())
        return
    }
    for (curCol in 0 until size) {
        if (isValid(size, curRow, curCol, board)) {
            var chars = board[curRow].toCharArray()

            chars[curCol] = 'Q'
            board[curRow] = String(chars)
            backTracking(size, curRow + 1, result, board)
            chars[curCol] = '.' //return to previous state to try with next column
            board[curRow] = String(chars)
        }
    }

}

private fun isValid(size: Int, curRow: Int, curCol: Int, board: MutableList<String>): Boolean {//curRow is row, curCol is column
    for (rowIndex in 0 until curRow) {
        if (board[rowIndex][curCol] == 'Q') return false //same column
        var offset = curRow - rowIndex
        var y1 = curCol - offset
        if (y1 in 0..(size - 1)) {
            if (board[rowIndex][y1] == 'Q') return false //backward diagonal
        }
        var y2 = curCol + offset
        if (y2 in 0..(size - 1)) {
            if (board[rowIndex][y2] == 'Q') return false //forward diagonal
        }
    }
    return true
}