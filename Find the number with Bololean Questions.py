a = 1
b = 2
while True:
    n = input(f" IS {b} < U? (True/False) ").strip().lower()

    if n == "true":
        a = b
        b *= 2
    elif n == "false":
        c = (a+b)//2
        n = input(f" IS {c} = U? (True/False) ").strip().lower()
        if n == "true":
            print("Found U: ", c)
            break
        if n == "false":
            b = c
    else:
        print("Invalid Input; please enter(True or False)")