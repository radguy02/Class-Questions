def prints(s):
    for i in range(9):
        for j in range(9):
            print(s[i][j], end=" ")
            if j == 2 or j == 5:
                print("|", end=" ")
        print()
        if i == 2 or i == 5:
            print("-" * 21)

def sol(s):
    row, col = blank_space(s)
    if row is None:
        return True  # All cells are filled, puzzle is solved
        
    for num in range(1, 10):
        if is_valid(s, num, row, col):
            s[row][col] = num
            if sol(s):
                return True
            s[row][col] = 0  #something works here, idk how but till it works I am fine
    return False

def blank_space(s):
    for i in range(9):
        for j in range(9):
            if s[i][j] == 0:
                return i, j
    return None, None

def is_valid(s, num, row, col):
    # Check row and column
    for i in range(9):
        if s[row][i] == num or s[i][col] == num:
            return False
    
    # Check 3x3 grid
    start_row, start_col = 3 * (row // 3), 3 * (col // 3)
    for i in range(start_row, start_row + 3):
        for j in range(start_col, start_col + 3):
            if s[i][j] == num:
                return False   
    return True

#For s(0 = empty cells)
s_grid = [
    [5, 3, 0, 0, 7, 0, 0, 0, 0],
    [6, 0, 0, 1, 9, 5, 0, 0, 0],
    [0, 9, 8, 0, 0, 0, 0, 6, 0],
    [8, 0, 0, 0, 6, 0, 0, 0, 3],
    [4, 0, 0, 8, 0, 3, 0, 0, 1],
    [7, 0, 0, 0, 2, 0, 0, 0, 6],
    [0, 6, 0, 0, 0, 0, 2, 8, 0],
    [0, 0, 0, 4, 1, 9, 0, 0, 5],
    [0, 0, 0, 0, 8, 0, 0, 7, 9]
]

if sol(s_grid):
    print("Answer")
    prints(s_grid)
else:
    print("No solution")